package com.lgd.winter.wechat.content.mini.bean.result;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author guochao
 * @since 1.0.0
 */
@Data
public class DataVisitDistributionObject {
    private String index;
    private List<Map<String, Integer>> item_list;
}