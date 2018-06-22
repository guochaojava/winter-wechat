package com.lgd.winter.wechat.content.mini.bean.result;

import lombok.Data;

/**
 * @author guochao
 * @since 1.0.0
 */
@Data
public class DataVisitPageObject {
    private String page_path;
    private Integer page_visit_pv;
    private Integer page_visit_uv;
    private Float page_staytime_pv;
    private Integer entrypage_pv;
    private Integer exitpage_pv;
    private Integer page_share_pv;
    private Integer page_share_uv;
}