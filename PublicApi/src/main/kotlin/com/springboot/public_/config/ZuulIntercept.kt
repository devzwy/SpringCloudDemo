//package com.springboot.public_.config
//
//import com.netflix.zuul.ZuulFilter
//import org.springframework.stereotype.Component
//
//@Component
//class ZuulIntercept: ZuulFilter() {
//    override fun run(): Any {
//        println("ZuulIntercept - run")
//        return "null"
//    }
//
//    override fun shouldFilter(): Boolean = true
//
//    override fun filterType(): String ="pre"
//
//    override fun filterOrder(): Int  = 0
//}