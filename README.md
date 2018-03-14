# winter-wechat
微信接口集成

使用方法
第一步 spring配置bean

    <bean id="baseConfig" class="com.lgd.winter.wechat.config.BaseConfig">
        <property name="appId" value="appId"/>
        <property name="appSecret" value="appSecret"/>
    </bean>

    <bean id="weChatTemplate" class="com.lgd.winter.wechat.core.WeChatTemplate">
        <property name="baseConfig" ref="baseConfig"/>
    </bean>
第二步 注入类

    @Autowired
    private WeChatTemplate weChatTemplate;
    
第三步 调用方法 注意所有方法返回都为json字符串

    String result = weChatTemplate.getAccessToken();
