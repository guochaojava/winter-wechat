package com.lgd.winter.wechat.content.mini.core;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.mini.bean.result.MiniClientInfoResult;
import com.lgd.winter.wechat.content.mini.request.MiniRequest;

/**
 * @author GuoChao.
 * @since 0.0.2
 */
public class DefaultMiniOperations implements MiniOperations {

    private BaseConfig baseConfig;

    public DefaultMiniOperations(BaseConfig baseConfig) {
        this.baseConfig = baseConfig;
    }

    @Override
    public MiniClientInfoResult getClientInfo(String jsCode) {
        String url = MiniRequest.CLIENT_INFO_GET.replaceAll("APPID", baseConfig.getMiniAppId());
        url = url.replaceAll("SECRET", baseConfig.getMiniAppSecret());
        url = url.replaceAll("JSCODE", jsCode);
        String result = HttpUtil.get(url);
        MiniClientInfoResult miniClientInfoResult = JSONUtil.toBean(result, MiniClientInfoResult.class);
        return miniClientInfoResult;
    }
}