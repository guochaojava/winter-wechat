package com.lgd.winter.wechat.content.mini.request;

/**
 * @author guochao
 * @since 1.0.0
 */
public final class MiniDataRequest {
    /**
     * 概况。用户访问小程序的详细数据可从访问分析中获取，概况中提供累计用户数等部分指标数据。
     */
    public static final String DATA_OVERVIEW_POST = "https://api.weixin.qq.com/datacube/getweanalysisappiddailysummarytrend?access_token=ACCESS_TOKEN";

    /**
     * 日趋势
     */
    public static final String DATA_DAY_TENDENCY_POST = "https://api.weixin.qq.com/datacube/getweanalysisappiddailyvisittrend?access_token=ACCESS_TOKEN";

    /**
     * 周趋势
     */
    public static final String DATA_WEEK_TENDENCY_POST = "https://api.weixin.qq.com/datacube/getweanalysisappidweeklyvisittrend?access_token=ACCESS_TOKEN";

    /**
     * 月趋势
     */
    public static final String DATA_MONTH_TENDENCY_POST = "https://api.weixin.qq.com/datacube/getweanalysisappidmonthlyvisittrend?access_token=ACCESS_TOKEN";

    /**
     * 访问分布
     */
    public static final String DATA_VISIT_DISTRIBUTION_POST = "https://api.weixin.qq.com/datacube/getweanalysisappidvisitdistribution?access_token=ACCESS_TOKEN";

    /**
     * 日留存
     */
    public static final String DATA_DAY_RETAIN_INFO_POST = "https://api.weixin.qq.com/datacube/getweanalysisappiddailyretaininfo?access_token=ACCESS_TOKEN";

    /**
     * 周留存
     */
    public static final String DATA_WEEK_RETAIN_INFO_POST = "https://api.weixin.qq.com/datacube/getweanalysisappidweeklyretaininfo?access_token=ACCESS_TOKEN";

    /**
     * 月留存
     */
    public static final String DATA_MONTH_RETAIN_INFO_POST = "https://api.weixin.qq.com/datacube/getweanalysisappidmonthlyretaininfo?access_token=ACCESS_TOKEN";

    /**
     * 访问页面
     */
    public static final String DATA_VISIT_PAGE_POST = "https://api.weixin.qq.com/datacube/getweanalysisappidvisitpage?access_token=ACCESS_TOKEN";

    /**
     * 用户画像
     */
    public static final String DATA_USER_PORTRAIT_POST = "https://api.weixin.qq.com/datacube/getweanalysisappiduserportrait?access_token=ACCESS_TOKEN";
}