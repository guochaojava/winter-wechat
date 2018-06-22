package com.lgd.winter.wechat.content.component.request;

/**
 * @author guochao.
 * @since 0.0.5
 */
public final class MiniRequest {
    /**
     * 为授权的小程序帐号上传小程序代码
     */
    public final static String MINI_COMMIT = "https://api.weixin.qq.com/wxa/commit?access_token=TOKEN";
    /**
     * 获取授权小程序帐号的可选类目
     */
    public final static String MINI_CATEGORY = "https://api.weixin.qq.com/wxa/get_category?access_token=TOKEN";
    /**
     * 获取小程序的第三方提交代码的页面配置
     */
    public final static String MINI_PAGE = "https://api.weixin.qq.com/wxa/get_page?access_token=TOKEN";
    /**
     * 将第三方提交的代码包提交审核
     */
    public final static String MINI_SUBMIT = "https://api.weixin.qq.com/wxa/submit_audit?access_token=TOKEN";
    /**
     * 查询最新一次提交的审核状态
     */
    public final static String MINI_LATEST = "https://api.weixin.qq.com/wxa/get_latest_auditstatus?access_token=TOKEN";
    /**
     * 发布已通过审核的小程序
     */
    public final static String MINI_RELEASE = "https://api.weixin.qq.com/wxa/release?access_token=TOKEN";
    /**
     * 设置小程序服务器域名
     */
    public final static String MINI_SERVER = "https://api.weixin.qq.com/wxa/modify_domain?access_token=TOKEN";
    /**
     * 设置小程序业务域名
     */
    public final static String MINI_BUSINESS = "https://api.weixin.qq.com/wxa/setwebviewdomain?access_token=TOKEN";
    /**
     * 组合模板并添加至帐号下的个人模板库
     */
    public final static String MINI_TEMPLATE_ADD = "https://api.weixin.qq.com/cgi-bin/wxopen/template/add?access_token=TOKEN";
}