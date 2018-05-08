package com.lgd.winter.wechat.content.tecent.core;

import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.tecent.bean.TecentAccessTokenResult;
import com.lgd.winter.wechat.content.tecent.request.AccountRequest;
import com.lgd.winter.wechat.content.tecent.request.BaseRequest;
import com.lgd.winter.wechat.content.tecent.request.UserRequest;

import java.util.Map;

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
        TecentAccessTokenResult tatr = JSONUtil.toBean(result, TecentAccessTokenResult.class);
        return tatr;
    }

    @Override
    public String getUserInfo(String accessToken, String openId) {
        String url = UserRequest.USER_INFO_GET.replaceAll("ACCESS_TOKEN", accessToken);
        url = url.replaceAll("OPENID", openId);
        return HttpUtil.get(url);
    }

    @Override
    public String getQrCodeTicket(String accessToken, Map<String, Object> map) {
        String url = AccountRequest.QRCODE_CREATE_TICKET_POST.replaceAll("TOKEN", accessToken);
        String a = JSONUtil.toJsonPrettyStr(map);
        return HttpUtil.post(url, a);
    }

    @Override
    public long getQrCode(String ticket, String path) {
        String url = AccountRequest.QRCODE_CREATE_GET.replaceAll("TICKET", ticket);
        return HttpUtil.downloadFile(url, FileUtil.file(path));
    }
}