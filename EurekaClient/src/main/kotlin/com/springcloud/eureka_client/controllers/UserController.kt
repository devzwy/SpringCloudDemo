package com.springcloud.eureka_client.controllers

import com.springcloud.eureka_client.User
import com.springcloud.eureka_client.service.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    lateinit var mUserServiceImpl: UserServiceImpl

    /**
     * 定义一个接口，回传一个指定的用户资料
     */
    @PostMapping("/getUser")
    fun getUser(): User = mUserServiceImpl.getUser()
}