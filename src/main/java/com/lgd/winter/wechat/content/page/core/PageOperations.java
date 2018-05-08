package com.lgd.winter.wechat.content.page.core;

import com.lgd.winter.wechat.content.page.bean.result.PageAccessTokenResult;
import com.lgd.winter.wechat.content.page.bean.result.PageUserInfoResult;

/**
 * 页面开发操作类
 *
 * @author guochao
 */
public interface PageOperations {

    /**
     * 页面开发获取accessToken
     *
     * @param code 授权code
     * @return PageAccessTokenResult对象
     */
    PageAccessTokenResult getAccessToken(String code);

    /**
     * 刷新access_token（如果需要）
     * 由于access_token拥有较短的有效期，当access_token超时后，可以使用refresh_token进行刷新，refresh_token有效期为30天，当refresh_token失效之后，需要用户重新授权。
     *
     * @param refreshToken 用户刷新access_token
     * @return PageAccessTokenResult对象
     */
    PageAccessTokenResult refreshAccessToken(String refreshToken);

    /**
     * 拉取用户信息(需scope为 snsapi_userinfo)
     *
     * @param accessToken 授权获取的accessToken
     * @param openId      用户openid
     * @return PageUserInfoResult 对象
     */
    PageUserInfoResult getUserInfo(String accessToken, String openId);

    /**
     * 检验授权凭证
     *
     * @param accessToken 网页授权接口调用凭证,注意：此access_token与基础支持的access_token不同
     * @param openId      用户的唯一标识
     * @return 微信接口返回
     */
    String authAccessToken(String accessToken, String openId);
}
