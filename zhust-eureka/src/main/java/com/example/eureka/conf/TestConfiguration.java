package com.example.eureka.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class TestConfiguration {
    Logger logger = LoggerFactory.getLogger(TestConfiguration.class);
    @Bean
    public Test test() {
        return new Test();
    }

    class Test{
        public Test() {
            logger.info("初始化Test");
        }
    }
}
