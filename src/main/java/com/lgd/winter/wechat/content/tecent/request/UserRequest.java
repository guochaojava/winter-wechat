package com.lgd.winter.wechat.content.tecent.request;

/**
 * @Date: 2018/3/13
 * @Time: 14:36
 * @Author GuoChao.
 * @Description: TODO 用户相关请求
 */
public final class UserRequest {
    //创建标签
    public static final String TAG_CREATE_POST = "https://api.weixin.qq.com/cgi-bin/tags/create?access_token=ACCESS_TOKEN";
    //获取公众号已创建的标签
    public static final String TAG_SELECT_ALL_GET = "https://api.weixin.qq.com/cgi-bin/tags/get?access_token=ACCESS_TOKEN";
    //编辑标签
    public static final String TAG_UPDATE_POST = "https://api.weixin.qq.com/cgi-bin/tags/update?access_token=ACCESS_TOKEN";
    //删除标签
    public static final String TAG_DELETE_POST = "https://api.weixin.qq.com/cgi-bin/tags/delete?access_token=ACCESS_TOKEN";
    //获取标签下粉丝列表
    public static final String TAG_SELECT_FANS_GET = "https://api.weixin.qq.com/cgi-bin/user/tag/get?access_token=ACCESS_TOKEN";
    //批量为用户打标签
    public static final String TAG_ADD_USER_POST = "https://api.weixin.qq.com/cgi-bin/tags/members/batchtagging?access_token=ACCESS_TOKEN";
    //批量为用户取消标签
    public static final String TAG_REMOVE_USER_POST = "https://api.weixin.qq.com/cgi-bin/tags/members/batchuntagging?access_token=ACCESS_TOKEN";
    //获取用户身上的标签列表
    public static final String TAG_SELECT_USER_POST = "https://api.weixin.qq.com/cgi-bin/tags/getidlist?access_token=ACCESS_TOKEN";

    //设置用户备注名  该接口暂时开放给微信认证的服务号
    public static final String REMARK_USER_POST = "https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=ACCESS_TOKEN";

    //获取用户基本信息(UnionID机制)
    public static final String USER_INFO_GET = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    //批量获取用户基本信息
    public static final String USER_INFO_BATCH_POST = "https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=ACCESS_TOKEN";

    //获取用户列表
    public static final String LIST_USER_GET = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&next_openid=NEXT_OPENID";
    //获取所有关注的人
    public static final String LIST_USER_ALL_GET = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN";

    //获取公众号的黑名单列表
    private static final String BLACKLIST_GET = "https://api.weixin.qq.com/cgi-bin/tags/members/getblacklist?access_token=ACCESS_TOKEN";
    //拉黑用户
    private static final String BLACKLIST_ADD_USER_POST = "https://api.weixin.qq.com/cgi-bin/tags/members/batchblacklist?access_token=ACCESS_TOKEN";
    //取消拉黑用户
    private static final String BLACKLIST_REMOVE_USER_POST = "https://api.weixin.qq.com/cgi-bin/tags/members/batchunblacklist?access_token=ACCESS_TOKEN";
}