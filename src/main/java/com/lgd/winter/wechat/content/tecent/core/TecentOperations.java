package com.lgd.winter.wechat.content.tecent.core;

import com.lgd.winter.wechat.content.tecent.bean.TecentAccessTokenResult;

import java.util.Map;

/**
 * @author guochao
 */
public interface TecentOperations {

    /**
     * 获取accessToken
     *
     * @return 微信接口返回数据
     */
    TecentAccessTokenResult getAccessToken();

    /**
     * 获取用户基本信息
     *
     * @param accessToken 微信凭证
     * @param openId      用户openId
     * @return 微信接口返回数据
     */
    String getUserInfo(String accessToken, String openId);

    /**
     * 获取二维码ticket
     *
     * @param accessToken 微信凭证
     * @param map         接口参数
     * @return 微信接口返回数据
     */
    String getQrCodeTicket(String accessToken, Map<String, Object> map);

    /**
     * 通过ticket换取二维码
     *
     * @param ticket 二维码ticket
     * @param path   二维码保存路径
     * @return 二维码大小
     */
    long getQrCode(String ticket, String path);


}
