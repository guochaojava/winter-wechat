# winter-wechat
微信接口集成

[点击跳转使用示例](https://github.com/guochaojava/winter-wechat-demo)

使用方法

第一步引用maven依赖  

    <dependency>
	    <groupId>com.github.guochaojava</groupId>
		<artifactId>winter-wechat</artifactId>
		<version>0.0.1</version>
	</dependency>

第二步 spring配置bean

    <bean id="baseConfig" class="com.lgd.winter.wechat.config.BaseConfig">
        <property name="appId" value="你微信公众号的appId"/>
        <property name="appSecret" value="你微信公众号的appSecret"/>
    </bean>

    <bean id="weChatTemplate" class="com.lgd.winter.wechat.core.WeChatTemplate">
        <property name="baseConfig" ref="baseConfig"/>
    </bean>
第三步 注入类

    @Autowired
    private WeChatTemplate weChatTemplate;
    
第四步 调用方法 注意所有方法返回都为json字符串

    String result = weChatTemplate.opsForTecent().getAccessToken();
