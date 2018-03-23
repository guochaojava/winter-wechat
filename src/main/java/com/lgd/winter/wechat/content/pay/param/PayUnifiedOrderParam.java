package com.lgd.winter.wechat.content.pay.param;

import lombok.Data;

/**
 * 微信支付-下单接口参数
 *
 * @author GuoChao.
 * @since
 */
@Data
public class PayUnifiedOrderParam {
    //设备号
    private String deviceInfo;
    //api支付秘钥
    private String key;
    //签名类型
    private String signType;
    //商品描述
    private String body;
    //商品详情
    private String detail;
    //附加数据
    private String attach;
    //商户订单号
    private String outTradeNo;
    //标价币种
    private String feeType;
    //标价金额
    private String totalFee;
    //终端IP
    private String spbillCreateIp;
    //交易起始时间
    private String timeStart;
    //交易结束时间
    private String timeExpire;
    //订单优惠标记
    private String goodsTag;
    //通知地址
    private String notifyUrl;
    //交易类型
    private String tradeType;
    //商品ID
    private String productId;
    //指定支付方式
    private String limitPay;
    //用户标识
    private String openId;
    //场景信息
    private String sceneInfo;
}