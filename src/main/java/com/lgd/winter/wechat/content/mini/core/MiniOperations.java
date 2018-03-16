package com.lgd.winter.wechat.content.mini.core;

public interface MiniOperations {

    /**
     * 获取小程序客户端openId等信息
     * @param jsCode 小程序登陆返回jsCode
     * @return 微信请求返回
     */
    String getClientInfo(String jsCode);
}
