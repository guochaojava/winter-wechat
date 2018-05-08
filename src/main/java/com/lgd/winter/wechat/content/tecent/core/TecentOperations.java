package com.lgd.winter.wechat.content.tecent.core;

import com.lgd.winter.wechat.content.tecent.bean.param.TecentQrCodeTicketParam;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentAccessTokenResult;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentQrTicketResult;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentUserInfoResult;

/**
 * 公众平台操作类
 *
 * @author guochao
 */
public interface TecentOperations {

    /**
     * 获取accessToken
     *
     * @return TecentAccessTokenResult 对象
     */
    TecentAccessTokenResult getAccessToken();

    /**
     * 获取用户基本信息
     *
     * @param accessToken 微信凭证
     * @param openId      用户openId
     * @return TecentUserInfoResult 对象
     */
    TecentUserInfoResult getUserInfo(String accessToken, String openId);

    /**
     * 获取二维码ticket
     *
     * @param accessToken 微信凭证
     * @param param       TecentQrCodeParam参数对象
     * @return 微信接口返回数据
     */
    TecentQrTicketResult getQrCodeTicket(String accessToken, TecentQrCodeTicketParam param);

    /**
     * 通过ticket换取二维码
     *
     * @param ticket 二维码ticket
     * @param path   二维码保存路径
     * @return 二维码大小
     */
    long getQrCode(String ticket, String path);


}
