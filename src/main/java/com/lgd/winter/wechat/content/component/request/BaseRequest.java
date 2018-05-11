package com.lgd.winter.wechat.content.component.request;

/**
 * @author guochao.
 * @since
 */
public final class BaseRequest {
    /**
     * 获取第三方api_component_token
     */
    public final static String COMPONENT_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/component/api_component_token";
    /**
     * 获取第三方pre_auth_code
     */
    public final static String COMPONENT_CODE_URL = "https://api.weixin.qq.com/cgi-bin/component/api_create_preauthcode?component_access_token=TOKEN";
    /**
     * 获取授权token
     */
    public final static String COMPONENT_AUTH_TOKEN = "https://api.weixin.qq.com/cgi-bin/component/api_query_auth?component_access_token=TOKEN";
    /**
     * 重新授权
     */
    public final static String COMPONENT_REFRESH_TOKEN = "https://api.weixin.qq.com/cgi-bin/component/api_authorizer_token?component_access_token=TOKEN";
}