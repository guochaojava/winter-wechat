package com.lgd.winter.wechat.config;

import lombok.Data;


/**
 * 微信基础配置Bean
 *
 * @author guochao
 * @since 0.0.1
 */
@Data
public class BaseConfig {
    /**
     * 公众平台用户唯一凭证
     */
    private String appId;
    /**
     * 公众平台用户唯一凭证密钥
     */
    private String appSecret;
    /**
     * 小程序唯一凭证
     */
    private String miniAppId;
    /**
     * 小程序唯一凭证秘钥
     */
    private String miniAppSecret;
    /**
     * 微信支付商户凭证
     */
    private String merchantId;
    /**
     * 微信支付秘钥
     */
    private String merchantSecret;


    /**
     * 第三方用户唯一凭证
     */
    private String componentAppId;
    /**
     * 第三方用户唯一凭证密钥
     */
    private String componentAppSecret;
    /**
     * 第三方token
     */
    private String componentToken;
    /**
     * 第三方消息key
     */
    private String componentKey;

    public BaseConfig() {

    }

    public BaseConfig(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public BaseConfig(String miniAppId, String miniAppSecret, String type) {
        this.miniAppId = miniAppId;
        this.miniAppSecret = miniAppSecret;
    }

    public BaseConfig(String appId, String appSecret, String miniAppId, String miniAppSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.miniAppId = miniAppId;
        this.miniAppSecret = miniAppSecret;
    }

    public BaseConfig(String appId, String appSecret, String miniAppId, String miniAppSecret, String merchantId, String merchantSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.miniAppId = miniAppId;
        this.miniAppSecret = miniAppSecret;
        this.merchantId = merchantId;
        this.merchantSecret = merchantSecret;
    }
}