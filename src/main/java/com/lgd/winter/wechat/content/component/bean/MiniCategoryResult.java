package com.lgd.winter.wechat.content.component.bean;

import lombok.Data;

import java.util.List;

/**
 * @author GuoChao.
 * @since 0.0.5
 */
@Data
public class MiniCategoryResult {
    private Integer errcode;
    private String errmsg;
    private List<CateGoryBean> category_list;
}