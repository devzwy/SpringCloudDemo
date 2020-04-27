package com.springcloud.eureka_client.service

import org.apache.catalina.User

interface IUserService {
    fun getUser(): com.springcloud.eureka_client.User
}