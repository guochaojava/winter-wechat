package com.lgd.winter.wechat.content.component.core;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.component.bean.*;
import com.lgd.winter.wechat.content.component.param.MiniCommitParam;
import com.lgd.winter.wechat.content.component.param.MiniServerParam;
import com.lgd.winter.wechat.content.component.param.MiniSubmitParam;
import com.lgd.winter.wechat.content.component.request.BaseRequest;
import com.lgd.winter.wechat.content.component.request.MiniRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author guochao.
 * @since
 */
public class DefaultComponentOperations implements ComponentOperations {

    private BaseConfig baseConfig;

    public DefaultComponentOperations(BaseConfig baseConfig) {
        this.baseConfig = baseConfig;
    }

    @Override
    public String getComponentAccessToken(String componentVerifyTicket) {
        Map<String, Object> map = new HashMap<>();
        map.put("component_appid", baseConfig.getAppId());
        map.put("component_appsecret", baseConfig.getAppSecret());
        map.put("component_verify_ticket", componentVerifyTicket);
        String a = JSONUtil.toJsonPrettyStr(map);
        String result = HttpUtil.post(BaseRequest.COMPONENT_TOKEN_URL, a);
        JSON json = JSONUtil.parse(result);
        return (String) json.getByPath("component_access_token");
    }

    @Override
    public String getComponentPreAuthCode(String componentAccessToken) {
        String url = BaseRequest.COMPONENT_CODE_URL.replaceAll("TOKEN", componentAccessToken);
        Map<String, Object> map = new HashMap<>();
        map.put("component_appid", baseConfig.getAppId());
        String a = JSONUtil.toJsonPrettyStr(map);
        String result = HttpUtil.post(url, a);
        JSON json = JSONUtil.parse(result);
        return (String) json.getByPath("pre_auth_code");
    }

    @Override
    public AuthResultBean getAuthorizationInfo(String componentAccessToken, String authorizationCode) {
        String urls = BaseRequest.COMPONENT_AUTH_TOKEN.replaceAll("TOKEN", componentAccessToken);
        Map<String, Object> map = new HashMap<>();
        map.put("component_appid", baseConfig.getAppId());
        map.put("authorization_code", authorizationCode);
        String a = JSONUtil.toJsonPrettyStr(map);
        String result = HttpUtil.post(urls, a);
        AuthResultBean authResultBean = JSONUtil.toBean(result, AuthResultBean.class);
        return authResultBean;
    }

    @Override
    public RefreshAuthorizationInfo refreshAuthorizationInfo(String componentAccessToken, String authorizerAppid, String authorizerRefreshToken) {
        String url = BaseRequest.COMPONENT_REFRESH_TOKEN.replaceAll("TOKEN", componentAccessToken);
        Map<String, Object> map = new HashMap<>();
        map.put("component_appid", baseConfig.getAppId());
        map.put("authorizer_appid", authorizerAppid);
        map.put("authorizer_refresh_token", authorizerRefreshToken);
        String a = JSONUtil.toJsonPrettyStr(map);
        String result = HttpUtil.post(url, a);
        RefreshAuthorizationInfo authResultBean = JSONUtil.toBean(result, RefreshAuthorizationInfo.class);
        return authResultBean;
    }

    @Override
    public MiniCommitResult commit(String token, MiniCommitParam parm) {
        String url = MiniRequest.MINI_COMMIT.replaceAll("TOKEN", token);
        String a = JSONUtil.toJsonStr(parm);
        String result = HttpUtil.post(url, a);
        MiniCommitResult mcr = JSONUtil.toBean(result, MiniCommitResult.class);
        return mcr;
    }

    @Override
    public MiniCategoryResult category(String token) {
        String url = MiniRequest.MINI_CATEGORY.replaceAll("TOKEN", token);
        String result = HttpUtil.get(url);
        MiniCategoryResult mcr = JSONUtil.toBean(result, MiniCategoryResult.class);
        return mcr;
    }

    @Override
    public MiniPageResult page(String token) {
        String url = MiniRequest.MINI_PAGE.replaceAll("TOKEN", token);
        String result = HttpUtil.get(url);
        MiniPageResult mcr = JSONUtil.toBean(result, MiniPageResult.class);
        return mcr;
    }

    @Override
    public MiniSubmitResult submit(String token, MiniSubmitParam param) {
        String url = MiniRequest.MINI_SUBMIT.replaceAll("TOKEN", token);
        String a = JSONUtil.toJsonStr(param);
        String result = HttpUtil.post(url, a);
        MiniSubmitResult mcr = JSONUtil.toBean(result, MiniSubmitResult.class);
        return mcr;
    }

    @Override
    public String latest(String token) {
        String url = MiniRequest.MINI_LATEST.replaceAll("TOKEN", token);
        String result = HttpUtil.get(url);
        return result;
    }

    @Override
    public String release(String token) {
        String url = MiniRequest.MINI_RELEASE.replaceAll("TOKEN", token);
        String result = HttpUtil.post(url, "{}");
        return result;
    }

    @Override
    public MiniServerResult server(String token, MiniServerParam param) {
        String url = MiniRequest.MINI_SERVER.replaceAll("TOKEN", token);
        String a = JSONUtil.toJsonStr(param);
        String result = HttpUtil.post(url, a);
        MiniServerResult msr = JSONUtil.toBean(result, MiniServerResult.class);
        return msr;
    }

    @Override
    public String business(String token, String action, List<String> domain) {
        return null;
    }

    @Override
    public MiniTemplateResult template(String token, String id, int[] list) {
        String url = MiniRequest.MINI_TEMPLATE_ADD.replaceAll("TOKEN", token);
        Map map = new HashMap<>();
        map.put("id", id);
        map.put("keyword_id_list", list);
        String a = JSONUtil.toJsonStr(map);
        String result = HttpUtil.post(url, a);
        MiniTemplateResult msr = JSONUtil.toBean(result, MiniTemplateResult.class);
        return msr;
    }
}