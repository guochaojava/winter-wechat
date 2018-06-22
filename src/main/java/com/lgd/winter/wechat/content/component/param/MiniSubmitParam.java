package com.lgd.winter.wechat.content.component.param;

import lombok.Data;

import java.util.List;

/**
 * @author GuoChao.
 * @since 0.0.5
 */
@Data
public class MiniSubmitParam {
    private List<ItemBean> item_list;
}