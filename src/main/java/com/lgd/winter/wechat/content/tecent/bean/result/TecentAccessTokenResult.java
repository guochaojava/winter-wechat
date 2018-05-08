package com.lgd.winter.wechat.content.tecent.bean.result;

import lombok.Builder;
import lombok.Data;

/**
 * 公众平台获取access_token结果对象
 *
 * @author GuoChao.
 * @since 0.0.4
 */
@Data
public class TecentAccessTokenResult {
    /**
     * 成功返回的获取到的凭证
     */
    private String accessToken;
    /**
     * 成功返回的凭证有效时间，单位：秒
     */
    private Integer expiresIn;
    /**
     * 失败返回的错误码
     */
    @Builder.Default
    private Integer errcode = 0;
    /**
     * 失败返回的错误信息
     */
    @Builder.Default
    private String errmsg = "success";
}