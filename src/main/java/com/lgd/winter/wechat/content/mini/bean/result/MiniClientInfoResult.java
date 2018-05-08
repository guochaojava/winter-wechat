package com.lgd.winter.wechat.content.mini.bean.result;

import lombok.Builder;
import lombok.Data;

/**
 * @author GuoChao.
 * @since 0.0.4
 */
@Data
public class MiniClientInfoResult {
    /**
     * 用户唯一标识
     */
    private String openid;
    /**
     * 会话密钥
     */
    private String sessionKey;
    /**
     * 用户在开放平台的唯一标识符
     */
    private String unionid;

    @Builder.Default
    private Integer errcode = 0;
    @Builder.Default
    private String errmsg = "success";
}