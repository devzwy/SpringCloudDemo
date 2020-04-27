package com.springboot.public_.config

import com.netflix.loadbalancer.IRule
import com.netflix.loadbalancer.WeightedResponseTimeRule
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class AppConfig {


    @Bean
    @LoadBalanced //Ribbon负载均衡
    fun restTemplate(): RestTemplate = RestTemplate()


    /**
     * 配置Ribbon负载均衡策略
     *  WeightedResponseTimeRule 响应时间加权
     */
    @Bean
    fun iRule(): IRule = WeightedResponseTimeRule()
}