package com.lgd.winter.wechat.content.mini.bean.result;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author guochao
 * @since 1.0.0
 */
@Data
public class DataRetainInfoResult {
    private String ref_date;
    private List<Map<String, Object>> visit_uv_new;
    private List<Map<String, Object>> visit_uv;
    @Builder.Default
    private Integer errcode = 0;
    @Builder.Default
    private String errmsg = "success";
}