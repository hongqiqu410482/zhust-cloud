package com.example.eureka.controller;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.Advised;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestController1 testController1;
    @RequestMapping("/test")
    public String test() {
        ((Advised) testController1).addAdvice(new Advice() {
        });
        return Boolean.toString(testController1 instanceof Advised);
    }
}
