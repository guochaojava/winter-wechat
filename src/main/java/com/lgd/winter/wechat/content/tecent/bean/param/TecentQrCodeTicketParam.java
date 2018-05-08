package com.lgd.winter.wechat.content.tecent.bean.param;

import lombok.Data;

/**
 * 公众平台获取创建二维码ticket参数
 *
 * @author GuoChao.
 * @since 0.0.4
 */
@Data
public class TecentQrCodeTicketParam {
    /**
     * 该二维码有效时间，以秒为单位。 最大不超过2592000（即30天），此字段如果不填，则默认有效期为30秒。
     */
    private Long expire_seconds;
    /**
     * 二维码类型，QR_SCENE为临时的整型参数值，QR_STR_SCENE为临时的字符串参数值，QR_LIMIT_SCENE为永久的整型参数值，QR_LIMIT_STR_SCENE为永久的字符串参数值
     */
    private String action_name;
    private TecentQrCodeTicketSceneParam action_info;
}