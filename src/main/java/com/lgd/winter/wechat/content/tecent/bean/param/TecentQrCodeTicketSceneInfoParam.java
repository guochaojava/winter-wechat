package com.lgd.winter.wechat.content.tecent.bean.param;

import lombok.Data;

/**
 * 二维码详细信息
 *
 * @author GuoChao.
 * @since 0.0.4
 */
@Data
public class TecentQrCodeTicketSceneInfoParam {
    /**
     * 场景值ID，临时二维码时为32位非0整型，永久二维码时最大值为100000（目前参数只支持1--100000）
     */
    private Long scene_id;
    /**
     * 场景值ID（字符串形式的ID），字符串类型，长度限制为1到64
     */
    private String scene_str;
}