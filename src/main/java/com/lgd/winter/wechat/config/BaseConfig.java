package com.lgd.winter.wechat.config;

import lombok.Data;

/**
 * @Date: 2018/3/13
 * @Time: 10:10
 * @Author GuoChao.
 * @Description: TODO 微信相关基本配置
 */
@Data
public class BaseConfig {
    //第三方用户唯一凭证
    private String appId;
    //第三方用户唯一凭证密钥
    private String appSecret;
    //小程序唯一凭证
    private String miniAppId;
    //小程序唯一凭证秘钥
    private String miniAppSecret;
    //微信支付商户凭证
    private String merchantId;
    //微信支付秘钥
    private String merchantSecret;

    public BaseConfig(){

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