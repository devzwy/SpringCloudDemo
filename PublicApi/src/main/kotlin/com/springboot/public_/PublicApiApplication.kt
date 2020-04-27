package com.springboot.public_

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
//@EnableZuulProxy
class PublicApiApplication

fun main(args: Array<String>) {
    runApplication<PublicApiApplication>(*args)
}
