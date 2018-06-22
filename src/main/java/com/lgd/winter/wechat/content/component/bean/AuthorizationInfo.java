package com.lgd.winter.wechat.content.component.bean;

import lombok.Data;

/**
 * @author GuoChao.
 * @since 0.0.5
 */
@Data
public class AuthorizationInfo {
    private String authorizerAppid;
    private String authorizerAccessToken;
    private String authorizerRefreshToken;
    private Integer expires_in;
    // List<FuncInfo> func_info;
}