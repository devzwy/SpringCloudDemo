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

### 项目启动流程：
首先启动注册中心:`EurekaServer`启动后访问`localhost:8000`看到如下页面  

![image1](https://github.com/devzwy/SpringCloudDemo/blob/master/images/1.png)    

随后启动微服务`EurekaClient()`,至少启动一个端口,启动后可在以上页面发现注册成功的微服务    

![image2](https://github.com/devzwy/SpringCloudDemo/blob/master/images/2.png)    

最后启动外部调用端微服务`PublicApi`,访问:`localhost/getUser`,数据会通过不同的端口返回，
如果其中有服务掉线后会通过熔断器返回预先定义好的数据，并根据熔断器配置的策略选择重连/remove机制，remove后该端口将不会被使用 



