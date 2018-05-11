package com.lgd.winter.wechat.content.component.bean;

import lombok.Data;

/**
 * @author GuoChao.
 * @since
 */
@Data
public class RefreshAuthorizationInfo {
    private String authorizerAccessToken;
    private Integer expiresIn;
    private String authorizerRefreshToken;

    private Integer errcode;
    private String errmsg;
}