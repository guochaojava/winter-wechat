package com.lgd.winter.wechat.content.component.core;

import com.lgd.winter.wechat.content.component.bean.*;
import com.lgd.winter.wechat.content.component.param.MiniCommitParam;
import com.lgd.winter.wechat.content.component.param.MiniServerParam;
import com.lgd.winter.wechat.content.component.param.MiniSubmitParam;

import java.util.List;

/**
 * 微信开放平台第三方操作类
 *
 * @author guochao
 */
public interface ComponentOperations {
    /**
     * 获取第三方component_access_token
     *
     * @param componentVerifyTicket 微信推送ticket
     * @return component_access_token
     */
    String getComponentAccessToken(String componentVerifyTicket);

    /**
     * 获取第三方pre_auth_code
     *
     * @param componentAccessToken 第三方component_access_token
     * @return pre_auth_code
     */
    String getComponentPreAuthCode(String componentAccessToken);

    /**
     * 获取授权信息
     *
     * @param componentAccessToken 第三方component_access_token
     * @param authorizationCode    授权code
     * @return
     */
    AuthResultBean getAuthorizationInfo(String componentAccessToken, String authorizationCode);

    /**
     * 刷新token
     *
     * @param componentAccessToken   第三方component_access_token
     * @param authorizerAppid        授权方appid
     * @param authorizerRefreshToken 刷新token
     * @return
     */
    RefreshAuthorizationInfo refreshAuthorizationInfo(String componentAccessToken, String authorizerAppid, String authorizerRefreshToken);

    /**
     * 第三方小程序上传
     *
     * @param token 授权token
     * @param parm  提交参数
     * @return 提交结果
     */
    MiniCommitResult commit(String token, MiniCommitParam parm);

    /**
     * 获取授权小程序帐号的可选类目
     *
     * @param token 授权token
     * @return 结果
     */
    MiniCategoryResult category(String token);

    /**
     * 获取小程序的第三方提交代码的页面配置
     *
     * @param token 授权token
     * @return 结果
     */
    MiniPageResult page(String token);

    /**
     * 将第三方提交的代码包提交审核
     *
     * @param token 授权token
     * @param param 提交参数
     * @return 提交结果
     */
    MiniSubmitResult submit(String token, MiniSubmitParam param);

    /**
     * 查询最新一次提交的审核状态
     *
     * @param token 授权token
     * @return 查询结果
     */
    String latest(String token);

    /**
     * 发布已通过审核的小程序
     *
     * @param token 授权token
     * @return 发布结果
     */
    String release(String token);


    /**
     * 设置小程序服务器域名
     *
     * @param token 授权token
     * @param param 设置参数
     * @return 请求返回
     */
    MiniServerResult server(String token, MiniServerParam param);


    /**
     * 设置小程序业务域名
     *
     * @param token  授权token
     * @param action 业务操作
     * @param domain 域名
     * @return 请求结果
     */
    String business(String token, String action, List<String> domain);

    MiniTemplateResult template(String token, String id, int[] list);
}
