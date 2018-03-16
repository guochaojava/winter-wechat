package com.lgd.winter.wechat.content.tecent.request;


/**
 * 账号相关请求
 * @author guochao
 */
public final class AccountRequest {
    //创建二维码ticket 自行设定的参数（scene_id）
    public static final String QRCODE_CREATE_TICKET_POST = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=TOKEN";
    //通过ticket换取二维码 提醒：TICKET记得进行UrlEncode
    public static final String QRCODE_CREATE_GET = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=TICKET";

    //将一条长链接转成短链接
    public static final String LINK_SHIFT_POST = "https://api.weixin.qq.com/cgi-bin/shorturl?access_token=ACCESS_TOKEN";
}