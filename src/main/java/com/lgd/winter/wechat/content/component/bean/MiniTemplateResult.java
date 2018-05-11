package com.lgd.winter.wechat.content.component.bean;

import lombok.Data;

/**
 * @author GuoChao.
 * @since
 */
@Data
public class MiniTemplateResult {
    private Integer errcode;
    private String errmsg;
    private String template_id;
}