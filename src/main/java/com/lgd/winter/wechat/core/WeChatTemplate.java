package com.lgd.winter.wechat.core;

import com.lgd.winter.wechat.config.BaseConfig;
import com.lgd.winter.wechat.content.mini.core.DefaultMiniOperations;
import com.lgd.winter.wechat.content.mini.core.MiniOperations;
import com.lgd.winter.wechat.content.page.core.DefaultPageOperations;
import com.lgd.winter.wechat.content.page.core.PageOperations;
import com.lgd.winter.wechat.content.pay.core.DefaultPayOperations;
import com.lgd.winter.wechat.content.pay.core.PayOperations;
import com.lgd.winter.wechat.content.tecent.core.DefaultTecentOperations;
import com.lgd.winter.wechat.content.tecent.core.TecentOperations;
import lombok.Data;

/**
 * 核心操作类
 *
 * @author guochao
 * @since 0.0.1
 */
@Data
public class WeChatTemplate implements WeChatOperations {

    /**
     * 基础配置
     */
    private BaseConfig baseConfig;

    /**
     * 公众平台操作模块
     */
    private TecentOperations tecentOps;

    /**
     * 小程序操作模块
     */
    private MiniOperations miniOps;

    /**
     * 支付操作模块
     */
    private PayOperations payOps;


    /**
     * 网页开发模块
     */
    private PageOperations pageOps;

    private WeChatTemplate() {

    }

    public TecentOperations opsForTecent() {
        if (tecentOps == null) {
            tecentOps = new DefaultTecentOperations(baseConfig);
        }
        return tecentOps;
    }

    public MiniOperations opsForMini() {
        if (miniOps == null) {
            miniOps = new DefaultMiniOperations(baseConfig);
        }
        return miniOps;
    }

    public PayOperations opsForPay() {
        if (payOps == null) {
            payOps = new DefaultPayOperations(baseConfig);
        }
        return payOps;
    }

    public PageOperations opsForPage() {
        if (pageOps == null) {
            pageOps = new DefaultPageOperations(baseConfig);
        }
        return pageOps;
    }

    public WeChatTemplate(BaseConfig config) {
        this.baseConfig = config;
    }

    @Override
    public void setBaseConfig(BaseConfig config) {
        this.baseConfig = config;
    }


}