package com.lgd.winter.wechat.content.page.request;

/**
 * 网页开发基础接口路径
 *
 * @author GuoChao.
 * @since 0.0.4
 */
public final class BaseRequest {
    /**
     * 获取access_token
     */
    public static final String ACCESS_TOKEN_GET = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";

    /**
     * 刷新access_token
     */
    public static final String REFRESH_ACCESS_TOKEN_GET = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=APPID&grant_type=refresh_token&refresh_token=REFRESH_TOKEN";

    /**
     * 获取用户信息
     */
    public static final String USER_INFO_GET = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";

    /**
     * 检验授权凭证
     */
    public static final String AUTH_ACCESS_TOKEN_GET = "https://api.weixin.qq.com/sns/auth?access_token=ACCESS_TOKEN&openid=OPENID";
}