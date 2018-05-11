package com.lgd.winter.wechat.content.component.bean;

import lombok.Data;

import java.util.List;

/**
 * @author GuoChao.
 * @since
 */
@Data
public class MiniCategoryResult {
    private Integer errcode;
    private String errmsg;
    private List<CateGoryBean> category_list;
}