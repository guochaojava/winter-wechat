package com.lgd.winter.wechat.content.component.bean;

import lombok.Data;

import java.util.List;

/**
 * @author GuoChao.
 * @since
 */
@Data
public class MiniServerResult {

    private Integer errcode;

    private String errmsg;

    private List<String> requestdomain;

    private List<String> wsrequestdomain;

    private List<String> uploaddomain;

    private List<String> downloaddomain;
}