# dubbo-springmvc
本简易项目来自于掘金的博客，地址为 https://www.extlight.com/2018/02/22/Dubbo-基础教程/ 
采用了zookeeper3.4.8作为注册中心，父项目是dubbo，子项目包含api，主要提供接口；dubbo-service，主要提供服务实现；dubbo-consumer，主要提供消费，
后两个为web项目，与springmvc整合。
然后博客中有一处错误：
在服务消费端的dubbo配置文件的<dubbo:reference interface="com.melo.service.HelloService"/>少一项id，加上id="helloService",
所以全称是： <dubbo:reference id="helloService" interface="com.melo.service.HelloService"/>，id必须加上，否则会注入接口失败。
