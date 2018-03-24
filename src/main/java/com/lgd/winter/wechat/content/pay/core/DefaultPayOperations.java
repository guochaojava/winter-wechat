package com.lgd.winter.wechat.content.pay.core;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpConnection;
import cn.hutool.http.HttpUtil;
import cn.hutool.http.Method;
import cn.hutool.http.ssl.SSLSocketFactoryBuilder;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.pay.param.PayRefundParam;
import com.lgd.winter.wechat.content.pay.param.PayUnifiedOrderParam;
import com.lgd.winter.wechat.content.pay.request.BaseRequest;
import com.lgd.winter.wechat.content.pay.util.XmlUtil;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 支付操作实现类
 *
 * @author GuoChao.
 * @since 0.0.2
 */
public class DefaultPayOperations implements PayOperations {

    private BaseConfig baseConfig;

    public DefaultPayOperations(BaseConfig config) {
        this.baseConfig = config;
    }

    @Override
    public String unifiedOrder(PayUnifiedOrderParam param) {
        Map<String, String> map = new TreeMap<>();
        //必须参数
        if (StrUtil.isNotEmpty(param.getTradeType()) && param.getTradeType().equals("JSAPP")) {
            map.put("appid", baseConfig.getMiniAppId());
        } else if (StrUtil.isNotEmpty(param.getTradeType()) && param.getTradeType().equals("APP")) {
            map.put("appid", baseConfig.getAppId());
        }

        map.put("mch_id", baseConfig.getMerchantId());
        map.put("openid", param.getOpenId());
        map.put("nonce_str", RandomUtil.randomString(32));
        map.put("body", param.getBody());
        map.put("out_trade_no", param.getOutTradeNo());
        map.put("total_fee", param.getTotalFee());
        map.put("spbill_create_ip", param.getSpbillCreateIp());
        map.put("notify_url", param.getNotifyUrl());
        map.put("trade_type", param.getTradeType());
        //非必须参数
        if (StrUtil.isNotEmpty(param.getDeviceInfo())) {
            map.put("device_info", param.getDeviceInfo());
        }
        if (StrUtil.isNotEmpty(param.getSignType())) {
            map.put("sign_type", param.getSignType());
        }
        if (StrUtil.isNotEmpty(param.getDetail())) {
            map.put("detail", param.getDetail());
        }
        if (StrUtil.isNotEmpty(param.getAttach())) {
            map.put("attach", param.getAttach());
        }
        if (StrUtil.isNotEmpty(param.getFeeType())) {
            map.put("fee_type", param.getFeeType());
        }
        if (StrUtil.isNotEmpty(param.getGoodsTag())) {
            map.put("goods_tag", param.getGoodsTag());
        }
        if (StrUtil.isNotEmpty(param.getProductId())) {
            map.put("product_id", param.getProductId());
        }
        if (StrUtil.isNotEmpty(param.getTimeStart())) {
            map.put("time_start", param.getTimeStart());
        }
        if (StrUtil.isNotEmpty(param.getTimeExpire())) {
            map.put("time_expire", param.getTimeExpire());
        }
        if (StrUtil.isNotEmpty(param.getLimitPay())) {
            map.put("limit_pay", param.getLimitPay());
        }
        if (StrUtil.isNotEmpty(param.getSceneInfo())) {
            map.put("scene_info", param.getSceneInfo());
        }

        //排序
        Map<String, String> sortedMap = sortMap(map);
        //签名
        String sign = buildSign(sortedMap);
        map.put("sing", sign);
        //转换xml
        String xml = XmlUtil.map2Xml(map);

        String result = HttpUtil.post(BaseRequest.PAY_UNIFIED_ORDER, xml);
        return result;
    }

    @Override
    public String closeOrder(String outTradeNo, String signType, String type) {
        Map<String, String> map = new TreeMap<>();
        //必须参数
        if (StrUtil.isNotEmpty(type) && type.equals("JSAPP")) {
            map.put("appid", baseConfig.getMiniAppId());
        } else if (StrUtil.isNotEmpty(type) && type.equals("APP")) {
            map.put("appid", baseConfig.getAppId());
        }
        map.put("mch_id", baseConfig.getMerchantId());
        map.put("out_trade_no", outTradeNo);
        map.put("nonce_str", RandomUtil.randomString(32));
        if (StrUtil.isNotEmpty(signType)) {
            map.put("sign_type", signType);
        }
        //排序
        Map<String, String> sortedMap = sortMap(map);
        //签名
        String sign = buildSign(sortedMap);
        //转换xml
        String xml = XmlUtil.map2Xml(map);

        return HttpUtil.post(BaseRequest.PAY_CLOSE_ORDER, xml);
    }

    @Override
    public String orderQuery(String transactionId, String outTradeNo, String signType, String type) {
        Map<String, String> map = new TreeMap<>();
        if (StrUtil.isNotEmpty(type) && type.equals("JSAPP")) {
            map.put("appid", baseConfig.getMiniAppId());
        } else if (StrUtil.isNotEmpty(type) && type.equals("APP")) {
            map.put("appid", baseConfig.getAppId());
        }
        map.put("mch_id", baseConfig.getMerchantId());
        if (StrUtil.isNotEmpty(transactionId)) {
            map.put("transaction_id", transactionId);
        }
        if (StrUtil.isNotEmpty(outTradeNo)) {
            map.put("out_trade_no", outTradeNo);
        }
        map.put("nonce_str", RandomUtil.randomString(32));
        if (StrUtil.isNotEmpty(signType)) {
            map.put("sign_type", outTradeNo);
        }
        //排序
        Map<String, String> sortedMap = sortMap(map);
        //签名
        String sign = buildSign(sortedMap);
        //转换xml
        String xml = XmlUtil.map2Xml(map);
        return HttpUtil.post(BaseRequest.PAY_ORDER_QUERY, xml);
    }

    @Override
    public String refund(PayRefundParam param, String type) throws Exception {
        SSLSocketFactoryBuilder ssfb = new SSLSocketFactoryBuilder();
        //设置协议
        ssfb.setProtocol(SSLSocketFactoryBuilder.TLSv1);
        //设置
        KeyStore keyStore  = KeyStore.getInstance("PKCS12");
        keyStore.load(new FileInputStream(param.getPath()),param.getPassword().toCharArray());
        TrustManagerFactory tmf=TrustManagerFactory.getInstance("SunX509");
        tmf.init(keyStore);
        ssfb.setTrustManagers(tmf.getTrustManagers());
        SSLSocketFactory ssf = ssfb.build();
        HttpConnection httpConnection =HttpConnection.create("", Method.POST,null, ssf);
        HttpConnection connect = httpConnection.connect();
        OutputStream outputStream = connect.getOutputStream();
        Console.log(outputStream);
        connect.disconnect();
        return null;
    }

    /**
     * 源自 https://github.com/nextyu/summer-wxpay
     *
     * @param map
     * @return 排序后参数map
     */
    private Map<String, String> sortMap(Map<String, String> map) {
        return CollectionUtil.sort(map, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * 源自 https://github.com/nextyu/summer-wxpay
     * 感谢
     *
     * @param map
     * @return 微信支付签名
     */
    private String buildSign(Map<String, String> map) {
        StringBuilder signing = new StringBuilder();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (StrUtil.isNotEmpty(entry.getValue())) {
                signing.append(entry.getKey()).append('=').append(entry.getValue()).append("&");
            }
        }

        // append key
        signing.append("key=").append(baseConfig.getMerchantSecret());

        return SecureUtil.md5(signing.toString()).toUpperCase();
    }
}