package com.lgd.winter.wechat.content.component.bean;

import lombok.Data;

import java.util.List;

/**
 * @author GuoChao.
 * @since
 */
@Data
public class MiniPageResult {
    private Integer errcode;
    private String errmsg;
    private List<String> pageList;
}