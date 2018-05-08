package com.lgd.winter.wechat.content.pay.param;

import lombok.Data;

/**
 * @author GuoChao.
 * @since 0.0.2
 */
@Data
public class PayRefundParam {
    /**
     * 签名类型
     */
    private String signType;
    /**
     * 微信订单号 与商户订单号二合一
     */
    private String outTradeNo;
    /**
     * 商户退款单号  商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔
     */
    private String outRefundNo;
    /**
     * 订单金额 订单总金额，单位为分，只能为整数
     */
    private long totalFee;
    /**
     * 退款金额 退款总金额，订单总金额，单位为分，只能为整数
     */
    private long refundFee;
    /**
     * 货币种类  默认人民币：CNY
     */
    private String refundFeeType;
    /**
     * 退款原因
     */
    private String refundDesc;
    /**
     * 退款资金来源
     */
    private String refundAccount;
    /**
     * 证书路径
     */
    private String path;
    /**
     * 秘钥密码
     */
    private String password;
}