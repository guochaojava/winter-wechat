package com.lgd.winter.wechat.content.tecent.request;

/**
 * @Date: 2018/3/13
 * @Time: 11:20
 * @Author GuoChao.
 * @Description: TODO 基本请求
 */
public final class BaseRequest {
    //获取access_token
    public static final String ACCESS_TOKEN_GET = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
}