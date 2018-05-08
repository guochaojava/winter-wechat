package com.lgd.winter.wechat.content.pay.request;

/**
 * 支付接口请求路径
 *
 * @author GuoChao.
 * @since 0.0.2
 */
public final class BaseRequest {
    /**
     * 统一下单
     */
    public static final String PAY_UNIFIED_ORDER = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    /**
     * 查询订单
     */
    public static final String PAY_ORDER_QUERY = "https://api.mch.weixin.qq.com/pay/orderquery";
    /**
     * 关闭订单
     */
    public static final String PAY_CLOSE_ORDER = "https://api.mch.weixin.qq.com/pay/closeorder";
    /**
     * 申请退款
     */
    public static final String PAY_REFUND = "https://api.mch.weixin.qq.com/secapi/pay/refund";
    /**
     * 查询退款
     */
    public static final String PAY_REFUND_QUERY = "https://api.mch.weixin.qq.com/pay/refundquery";
    /**
     * 下载对账单
     */
    public static final String PAY_DOWNLOAD_BILL = "https://api.mch.weixin.qq.com/pay/downloadbill";
    /**
     * 下载资金账单
     */
    public static final String DOWNLOAD_FUND_FLOW = "https://api.mch.weixin.qq.com/pay/downloadfundflow";
    /**
     * 交易保障
     */
    public static final String PAY_ITIL_REPORT = "https://api.mch.weixin.qq.com/payitil/report";
}