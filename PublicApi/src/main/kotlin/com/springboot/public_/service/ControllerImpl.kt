package com.springboot.public_.service

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import com.springboot.public_.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate


@Service
class ControllerImpl:IController {

    @Autowired
    lateinit var restTemplate: RestTemplate

    //一旦调用服务方法失败并抛出了错误信息后会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "getUserErr")
    override fun getUser(): User? = restTemplate.postForObject("http://UserController/getUser", null,User::class.java)

    fun getUserErr():User? = User(from = "getUser执行失败,熔断器拦截错误")
}