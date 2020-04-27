package com.springcloud.eureka_client

//测试用的用户数据
data class User(val name:String = "张三",val sex:Int = 1,val age:Int = 28,val from:String = "用户张三，返回自EurekaClient，端口9000")