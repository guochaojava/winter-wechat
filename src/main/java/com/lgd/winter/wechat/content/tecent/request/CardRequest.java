package com.lgd.winter.wechat.content.tecent.request;


/**
 * 公众平台卡卷相关接口路径
 *
 * @author guochao
 * @since 0.0.1
 */
public final class CardRequest {
    /**
     * 上传图片接口
     */
    public static final String CARD_UPLOAD_IMG_POST = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
    /**
     * 创建卡券
     */
    public static final String CARD_CREATE_POST = "https://api.weixin.qq.com/card/create?access_token=ACCESS_TOKEN";
}