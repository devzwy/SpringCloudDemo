package com.springcloud.eureka_client.service

import com.springcloud.eureka_client.User
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class UserServiceImpl:IUserService {
    @Value("\${server.port}")
    lateinit var port: Any
    override fun getUser(): User = User(from = "返回自：${port}端口")
}