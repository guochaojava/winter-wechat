package com.lgd.winter.wechat.content.mini.core;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.mini.bean.result.*;
import com.lgd.winter.wechat.content.mini.request.MiniDataRequest;
import com.lgd.winter.wechat.content.mini.request.MiniRequest;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentAccessTokenResult;
import com.lgd.winter.wechat.content.tecent.request.BaseRequest;

import java.util.HashMap;
import java.util.Map;

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
    public TecentAccessTokenResult getAccessToken() {
        String url = BaseRequest.ACCESS_TOKEN_GET.replaceAll("APPID", baseConfig.getMiniAppId());
        url = url.replaceAll("APPSECRET", baseConfig.getMiniAppSecret());
        String result = HttpUtil.get(url);
        TecentAccessTokenResult tecentAccessTokenResult = JSONUtil.toBean(result, TecentAccessTokenResult.class);
        return tecentAccessTokenResult;
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

    @Override
    public DataOverviewListResult getDataOverview(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_OVERVIEW_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataOverviewListResult dataOverviewListResult = JSONUtil.toBean(result, DataOverviewListResult.class);
        return dataOverviewListResult;
    }

    @Override
    public DataTendencyListResult getDataDayTendency(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_DAY_TENDENCY_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataTendencyListResult dataDayTendencyListResult = JSONUtil.toBean(result, DataTendencyListResult.class);
        return dataDayTendencyListResult;
    }

    @Override
    public DataTendencyListResult getDataWeekTendency(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_WEEK_TENDENCY_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataTendencyListResult dataDayTendencyListResult = JSONUtil.toBean(result, DataTendencyListResult.class);
        return dataDayTendencyListResult;
    }

    @Override
    public DataTendencyListResult getDataMonthTendency(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_MONTH_TENDENCY_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataTendencyListResult dataDayTendencyListResult = JSONUtil.toBean(result, DataTendencyListResult.class);
        return dataDayTendencyListResult;
    }

    @Override
    public DataVisitDistributionListResult getDataVisitDistribution(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_VISIT_DISTRIBUTION_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataVisitDistributionListResult dataVisitDistributionListResult = JSONUtil.toBean(result, DataVisitDistributionListResult.class);
        return dataVisitDistributionListResult;
    }

    @Override
    public DataRetainInfoResult getDataDayRetainInfo(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_DAY_RETAIN_INFO_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataRetainInfoResult dataRetainInfoResult = JSONUtil.toBean(result, DataRetainInfoResult.class);
        return dataRetainInfoResult;
    }

    @Override
    public DataRetainInfoResult getDataWeekRetainInfo(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_WEEK_RETAIN_INFO_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataRetainInfoResult dataRetainInfoResult = JSONUtil.toBean(result, DataRetainInfoResult.class);
        return dataRetainInfoResult;
    }

    @Override
    public DataRetainInfoResult getDataMonthRetainInfo(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_MONTH_RETAIN_INFO_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataRetainInfoResult dataRetainInfoResult = JSONUtil.toBean(result, DataRetainInfoResult.class);
        return dataRetainInfoResult;
    }

    @Override
    public DataVisitPageListResult getDataVisitPage(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_VISIT_PAGE_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataVisitPageListResult dataVisitPageListResult = JSONUtil.toBean(result, DataVisitPageListResult.class);
        return dataVisitPageListResult;
    }

    @Override
    public DataUserPortraitResult getUserPortrait(String accessToken, String beginDate, String endDate) {
        String url = MiniDataRequest.DATA_USER_PORTRAIT_POST.replaceAll("ACCESS_TOKEN", accessToken);
        Map<String, Object> param = new HashMap<>(2);
        param.put("begin_date", beginDate);
        param.put("end_date", endDate);
        String result = HttpUtil.post(url, JSONUtil.toJsonPrettyStr(param));
        DataUserPortraitResult dataUserPortraitResult = JSONUtil.toBean(result, DataUserPortraitResult.class);
        return dataUserPortraitResult;
    }
}