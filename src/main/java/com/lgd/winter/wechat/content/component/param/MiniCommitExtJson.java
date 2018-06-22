package com.lgd.winter.wechat.content.component.param;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author GuoChao.
 * @since 0.0.5
 */
@Data
public class MiniCommitExtJson {
    private String extAppid;
    private Map ext;
    private List<String> pages;
}