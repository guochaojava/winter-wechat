package com.lgd.winter.wechat.content.tecent.core;

import java.util.Map;

public interface TecentOperations {

    /**
     * 获取accessToken
     *
     * @return
     */
    String getAccessToken();

    /**
     * 获取用户基本信息
     *
     * @param accessToken
     * @param openId
     * @return
     */
    String getUserInfo(String accessToken, String openId);

    /**
     * 获取二维码ticket
     *
     * @param accessToken
     * @param map
     * @return
     */
    String getQrCodeTicket(String accessToken, Map<String, Object> map);

    
}
