package com.lgd.winter.wechat.content.mini.bean.result;

import lombok.Builder;
import lombok.Data;

/**
 * @author guochao
 * @since 1.0.0
 */
@Data
public class DataUserPortraitResult {
    private String ref_date;
    private DataUserPortraitObject visit_uv_new;
    private DataUserPortraitObject visit_uv;

    @Builder.Default
    private Integer errcode = 0;
    @Builder.Default
    private String errmsg = "success";
}