package com.lgd.winter.wechat.content.pay.core;

import com.lgd.winter.wechat.content.pay.param.PayRefundParam;
import com.lgd.winter.wechat.content.pay.param.PayUnifiedOrderParam;

public interface PayOperations {
    /**
     * 统一下单
     *
     * @param param 小程序下单支付参数
     * @return 微信接口请求
     */
    String unifiedOrder(PayUnifiedOrderParam param);

    /**
     * 关闭订单
     *
     * @param outTradeNo 商户订单号
     * @param signType   签名类型
     * @param type       交易类型  JSAPP-小程序支付  APP-APP支付
     * @return 微信接口返回
     */
    String closeOrder(String outTradeNo, String signType, String type);

    /**
     * 查询订单
     *
     * @param transactionId 微信订单号 与商户订单号二者选一
     * @param outTradeNo    商户订单号 与微信订单号二者选一
     * @param signType      签名类型
     * @param type          交易类型  JSAPP-小程序支付  APP-APP支付
     * @return 微信接口返回
     */
    String orderQuery(String transactionId, String outTradeNo, String signType, String type);

    /**
     * 申请退款
     *
     * @param param 拒绝参数
     * @param type  交易类型  JSAPP-小程序支付  APP-APP支付
     * @return 微信接口返回
     * @throws Exception 异常
     */
    String refund(PayRefundParam param, String type) throws Exception;
}
