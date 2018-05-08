package com.lgd.winter.wechat.content.page.bean.result;

import lombok.Builder;
import lombok.Data;

/**
 * 页面开发 获取accessToken返回
 *
 * @author GuoChao.
 * @since 0.0.4
 */
@Data
public class PageAccessTokenResult {
    /**
     * 网页授权接口调用凭证,注意：此access_token与基础支持的access_token不同
     */
    private String accessToken;
    /**
     * access_token接口调用凭证超时时间，单位（秒）
     */
    private Long expiresIn;
    /**
     * 用户刷新access_token
     */
    private String refreshToken;
    /**
     * 用户唯一标识，请注意，在未关注公众号时，用户访问公众号的网页，也会产生一个用户和公众号唯一的OpenID
     */
    private String openid;
    /**
     * 用户授权的作用域，使用逗号（,）分隔
     */
    private String scope;

    @Builder.Default
    private Integer errcode = 0;
    @Builder.Default
    private String errmsg = "success";
}