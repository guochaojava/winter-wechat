package com.lgd.winter.wechat.content.tecent.request;

/**
 * 基本请求
 * @author guochao
 * @since 0.0.1
 */
public final class BaseRequest {
    //获取access_token
    public static final String ACCESS_TOKEN_GET = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
}