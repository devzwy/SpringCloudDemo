package com.springboot.public_.contorllers

import com.springboot.public_.User
import com.springboot.public_.service.ControllerImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @Autowired
    lateinit var mControllerImpl: ControllerImpl

    @RequestMapping("/getUser")
    fun getUser(): User? = mControllerImpl.getUser()
}