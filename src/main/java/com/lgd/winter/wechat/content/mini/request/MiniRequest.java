package com.lgd.winter.wechat.content.mini.request;

/**
 * 小程序接口请求路径
 *
 * @author GuoChao.
 * @since 0.0.2
 */
public final class MiniRequest {

    /**
     * 获取用户openId等数据
     */
    public static final String CLIENT_INFO_GET = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
}