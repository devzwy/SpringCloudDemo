package com.springcloud.eureka

import org.springframework.cloud.netflix.eureka.server.event.*
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat


@Component
class EurekaStateListener {

    var times = 0

    @EventListener
    fun listener(event: EurekaInstanceCanceledEvent) {
        times++
        if (times == 2) {
            times = 0
            return
        }
        println("服务[${event.appName} - ${event.serverId}]已经下线")
    }

    @EventListener
    fun listen(event: EurekaInstanceRegisteredEvent) {
        val instanceInfo = event.instanceInfo
        println("服务[${instanceInfo.appName + instanceInfo.hostName.toString() + "  " + instanceInfo.ipAddr.toString() + "  " + instanceInfo.port}]进行注册")
    }

    @EventListener
    fun listen(event: EurekaInstanceRenewedEvent) {
        println("服务[${event.serverId + "  " + event.appName}]进行续约")
    }

    @EventListener
    fun listen(event: EurekaRegistryAvailableEvent?) {
        println("注册中心启动,[${SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis())}]")
    }

    @EventListener
    fun listen(event: EurekaServerStartedEvent?) {
        println("注册中心服务端启动,[${SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis())}]")
    }
}