package com.lgd.winter.wechat.content.component.param;

import lombok.Data;

/**
 * @author GuoChao.
 * @since 0.0.5
 */
@Data
public class MiniCommitParam {
    private Integer template_id;
    private String ext_json;
    private String user_version;
    private String user_desc;
}