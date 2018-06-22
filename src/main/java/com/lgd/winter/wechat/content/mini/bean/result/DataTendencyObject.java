package com.lgd.winter.wechat.content.mini.bean.result;

import lombok.Data;

/**
 * @author guochao
 * @since 1.0.0
 */
@Data
public class DataTendencyObject {
    private String ref_date;
    private Integer session_cnt;
    private Integer visit_pv;
    private Integer visit_uv;
    private Integer visit_uv_new;
    private Float stay_time_uv;
    private Float stay_time_session;
    private Float visit_depth;
}