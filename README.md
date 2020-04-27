# SpringCloud使用到的相关组件以及端口等说明
___

 EurekaServer：服务注册中心 端口使用8000  
 EurekaClient：微服务客户端(内容提供者) 端口分别使用9000、9001、9002、9003，在Idea Configuration中自行配置  
 PublicApi：消费端+Hystrix（熔断器）+Zuul(路由网关以及全局拦截)  外网调用路径 端口80 
#### 1. Eureka  
服务治理,服务注册中心  
#### 2.Hystrix
熔断器
#### 3.Zuul
路由网关以及全局拦截  





