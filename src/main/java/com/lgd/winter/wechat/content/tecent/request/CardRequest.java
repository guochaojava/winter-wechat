package com.lgd.winter.wechat.content.tecent.request;


/**
 * 卡卷相关请求
 * @author guochao
 */
public final class CardRequest {
    //上传图片接口
    public static final String CARD_UPLOAD_IMG_POST = "https://api.weixin.qq.com/cgi-bin/media/uploadimg?access_token=ACCESS_TOKEN";
    //创建卡券
    public static final String CARD_CREATE_POST = "https://api.weixin.qq.com/card/create?access_token=ACCESS_TOKEN";
}