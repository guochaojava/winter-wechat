package com.lgd.winter.wechat.content.tecent.core;

import java.util.Map;

public interface TecentOperations {

    /**
     * 获取accessToken
     *
     * @return 微信接口返回数据
     */
    String getAccessToken();

    /**
     * 获取用户基本信息
     *
     * @param accessToken 微信凭证
     * @param openId 用户openId
     * @return 微信接口返回数据
     */
    String getUserInfo(String accessToken, String openId);

    /**
     * 获取二维码ticket
     *
     * @param accessToken 微信凭证
     * @param map 接口参数
     * @return 微信接口返回数据
     */
    String getQrCodeTicket(String accessToken, Map<String, Object> map);
}
