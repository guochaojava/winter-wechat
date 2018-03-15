package com.lgd.winter.wechat.core;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.mini.core.MiniOperations;
import com.lgd.winter.wechat.content.pay.core.PayOperations;
import com.lgd.winter.wechat.content.tecent.core.TecentOperations;
import com.lgd.winter.wechat.content.tecent.request.AccountRequest;
import com.lgd.winter.wechat.content.tecent.request.BaseRequest;
import com.lgd.winter.wechat.content.tecent.request.UserRequest;
import lombok.Data;

import java.util.Map;

/**
 * @Date: 2018/3/13
 * @Time: 10:21
 * @Author GuoChao.
 * @Description: TODO 核心操作类
 */
@Data
public class WeChatTemplate implements WeChatOperations, TecentOperations, MiniOperations, PayOperations {

    private BaseConfig baseConfig;

    private WeChatTemplate(){

    }

    public WeChatTemplate(BaseConfig config) {
        this.baseConfig = config;
    }

    @Override
    public void setBaseConfig(BaseConfig config) {
        this.baseConfig = config;
    }

    @Override
    public String getAccessToken() {
        String url = BaseRequest.ACCESS_TOKEN_GET.replaceAll("APPID", baseConfig.getAppId());
        url = url.replaceAll("APPSECRET", baseConfig.getAppSecret());
        return HttpUtil.get(url);
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

}