package com.lgd.winter.wechat.content.mini.core;

import com.lgd.winter.wechat.content.mini.bean.result.*;
import com.lgd.winter.wechat.content.tecent.bean.result.TecentAccessTokenResult;

/**
 * @author guochao
 */
public interface MiniOperations {

    /**
     * 获取accessToken
     *
     * @return TecentAccessTokenResult 对象
     */
    TecentAccessTokenResult getAccessToken();

    /**
     * 获取小程序客户端openId等信息
     *
     * @param jsCode 小程序登陆返回jsCode
     * @return 微信请求返回 MiniClientInfoResult对象
     */
    MiniClientInfoResult getClientInfo(String jsCode);

    /**
     * 获取小程序数据：概况
     *
     * @param accessToken token
     * @param beginDate   开始日期
     * @param endDate     结束日期，限定查询1天数据，end_date允许设置的最大值为昨日
     * @return 结果
     */
    DataOverviewListResult getDataOverview(String accessToken, String beginDate, String endDate);

    /**
     * 获取小程序数据：日趋势
     *
     * @param accessToken token
     * @param beginDate   开始日期
     * @param endDate     结束日期，限定查询1天数据，end_date允许设置的最大值为昨日
     * @return 结果
     */
    DataTendencyListResult getDataDayTendency(String accessToken, String beginDate, String endDate);

    /**
     * 获取小程序数据：周趋势
     *
     * @param accessToken token
     * @param beginDate   开始日期，为周一日期
     * @param endDate     结束日期，为周日日期，限定查询一周数据
     * @return 结果
     */
    DataTendencyListResult getDataWeekTendency(String accessToken, String beginDate, String endDate);

    /**
     * 获取小程序数据：月趋势
     *
     * @param accessToken token
     * @param beginDate   开始日期，为自然月第一天
     * @param endDate     结束日期，为自然月最后一天，限定查询一个月数据
     * @return 结果
     */
    DataTendencyListResult getDataMonthTendency(String accessToken, String beginDate, String endDate);

    /**
     * 获取小程序数据：访问分布
     *
     * @param accessToken token
     * @param beginDate   开始日期
     * @param endDate     结束日期，限定查询1天数据，end_date允许设置的最大值为昨日
     * @return 结果
     */
    DataVisitDistributionListResult getDataVisitDistribution(String accessToken, String beginDate, String endDate);

    /**
     * 日留存
     *
     * @param accessToken token
     * @param beginDate   开始日期
     * @param endDate     结束日期，限定查询1天数据，end_date允许设置的最大值为昨日
     * @return 结果
     */
    DataRetainInfoResult getDataDayRetainInfo(String accessToken, String beginDate, String endDate);

    /**
     * 周留存
     *
     * @param accessToken token
     * @param beginDate   开始日期，为周一日期
     * @param endDate     结束日期，为周日日期，限定查询一周数据
     * @return 结果
     */
    DataRetainInfoResult getDataWeekRetainInfo(String accessToken, String beginDate, String endDate);

    /**
     * 月留存
     *
     * @param accessToken token
     * @param beginDate   开始日期，为自然月第一天
     * @param endDate     结束日期，为自然月最后一天，限定查询一个月数据
     * @return 结果
     */
    DataRetainInfoResult getDataMonthRetainInfo(String accessToken, String beginDate, String endDate);

    /**
     * 访问页面
     *
     * @param accessToken token
     * @param beginDate   开始日期
     * @param endDate     结束日期，限定查询1天数据，end_date允许设置的最大值为昨日
     * @return 结果
     */
    DataVisitPageListResult getDataVisitPage(String accessToken, String beginDate, String endDate);

    /**
     * 用户画像
     *
     * @param accessToken token
     * @param beginDate 开始日期
     * @param endDate 结束日期，开始日期与结束日期相差的天数限定为0/6/29，分别表示查询最近1/7/30天数据，end_date允许设置的最大值为昨日
     * @return 结果
     */
    DataUserPortraitResult getUserPortrait(String accessToken, String beginDate, String endDate);
}
