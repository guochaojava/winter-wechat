package com.lgd.winter.wechat.content.tecent.core;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.tecent.bean.param.TecentQrCodeTicketParam;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentAccessTokenResult;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentQrTicketResult;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentUserInfoResult;
import com.lgd.winter.wechat.content.tecent.request.AccountRequest;
import com.lgd.winter.wechat.content.tecent.request.BaseRequest;
import com.lgd.winter.wechat.content.tecent.request.UserRequest;

/**
 * @author GuoChao.
 * @since 0.0.1
 */
public class DefaultTecentOperations implements TecentOperations {

    private BaseConfig baseConfig;

    public DefaultTecentOperations(BaseConfig baseConfig) {
        this.baseConfig = baseConfig;
    }

    @Override
    public TecentAccessTokenResult getAccessToken() {
        String url = BaseRequest.ACCESS_TOKEN_GET.replaceAll("APPID", baseConfig.getAppId());
        url = url.replaceAll("APPSECRET", baseConfig.getAppSecret());
        String result = HttpUtil.get(url);
        TecentAccessTokenResult tecentAccessTokenResult = JSONUtil.toBean(result, TecentAccessTokenResult.class);
        return tecentAccessTokenResult;
    }

    @Override
    public TecentUserInfoResult getUserInfo(String accessToken, String openId) {
        String url = UserRequest.USER_INFO_GET.replaceAll("ACCESS_TOKEN", accessToken);
        url = url.replaceAll("OPENID", openId);
        String result = HttpUtil.get(url);
        TecentUserInfoResult tecentUserInfoResult = JSONUtil.toBean(result, TecentUserInfoResult.class);
        return tecentUserInfoResult;
    }

    @Override
    public TecentQrTicketResult getQrCodeTicket(String accessToken, TecentQrCodeTicketParam param) {
        String url = AccountRequest.QRCODE_CREATE_TICKET_POST.replaceAll("TOKEN", accessToken);
        String a = JSONUtil.toJsonStr(param);
        String result = HttpUtil.post(url, a);
        TecentQrTicketResult tecentQrTicketResult = JSONUtil.toBean(result, TecentQrTicketResult.class);
        return tecentQrTicketResult;
    }

    @Override
    public long getQrCode(String ticket, String path) {
        String url = AccountRequest.QRCODE_CREATE_GET.replaceAll("TICKET", ticket);
        return HttpUtil.downloadFile(url, FileUtil.file(path));
    }
}