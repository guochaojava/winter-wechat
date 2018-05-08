package com.lgd.winter.wechat.content.page.core;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.page.bean.result.PageAccessTokenResult;
import com.lgd.winter.wechat.content.page.bean.result.PageUserInfoResult;
import com.lgd.winter.wechat.content.page.request.BaseRequest;

/**
 * @author GuoChao.
 * @since 0.0.4
 */
public class DefaultPageOperations implements PageOperations {

    private BaseConfig baseConfig;

    public DefaultPageOperations(BaseConfig baseConfig) {
        this.baseConfig = baseConfig;
    }

    @Override
    public PageAccessTokenResult getAccessToken(String code) {
        String url = BaseRequest.ACCESS_TOKEN_GET.replaceAll("APPID", baseConfig.getAppId());
        url = url.replaceAll("SECRET", baseConfig.getAppSecret());
        url = url.replaceAll("CODE", code);
        String result = HttpUtil.get(url);
        PageAccessTokenResult pageAccessTokenResult = JSONUtil.toBean(result, PageAccessTokenResult.class);
        return pageAccessTokenResult;
    }

    @Override
    public PageAccessTokenResult refreshAccessToken(String refreshToken) {
        String url = BaseRequest.REFRESH_ACCESS_TOKEN_GET.replaceAll("APPID", baseConfig.getAppId());
        url = url.replaceAll("REFRESH_TOKEN", refreshToken);
        String result = HttpUtil.get(url);
        PageAccessTokenResult pageAccessTokenResult = JSONUtil.toBean(result, PageAccessTokenResult.class);
        return pageAccessTokenResult;
    }

    @Override
    public PageUserInfoResult getUserInfo(String accessToken, String openId) {
        String url = BaseRequest.USER_INFO_GET.replaceAll("ACCESS_TOKEN", accessToken);
        url = url.replaceAll("OPENID", openId);
        String result = HttpUtil.get(url);
        PageUserInfoResult pageAccessTokenResult = JSONUtil.toBean(result, PageUserInfoResult.class);
        return pageAccessTokenResult;
    }

    @Override
    public String authAccessToken(String accessToken, String openId) {
        String url = BaseRequest.AUTH_ACCESS_TOKEN_GET.replaceAll("ACCESS_TOKEN", accessToken);
        url = url.replaceAll("OPENID", openId);
        return HttpUtil.get(url);
    }
}