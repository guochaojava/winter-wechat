package com.lgd.winter.wechat.content.tecent.bean;

import lombok.Builder;
import lombok.Data;

/**
 * 公众平台获取access_token结果
 *
 * @author GuoChao.
 * @since 0.0.4
 */
@Data
public class TecentAccessTokenResult {
    private String accessToken;
    private Integer expiresIn;
    @Builder.Default
    private Integer errcode = 0;
    @Builder.Default
    private String errmsg = "success";
}