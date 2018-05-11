package com.lgd.winter.wechat.content.component.param;

import lombok.Data;

import java.util.List;

/**
 * @author GuoChao.
 * @since
 */
@Data
public class MiniServerParam {
    private String action;
    private List<String> requestdomain;
    private List<String> wsrequestdomain;
    private List<String> uploaddomain;
    private List<String> downloaddomain;
}