package com.example.eureka.controller;

import com.example.eureka.conf.InitialBean;
import org.aopalliance.aop.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController1 {
    @Autowired
    private InitialBean initialBean;
    @RequestMapping("/test1")
    public String test() {
        return Boolean.toString(initialBean instanceof Advice);
    }
}
