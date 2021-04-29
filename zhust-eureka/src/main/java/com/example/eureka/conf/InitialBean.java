package com.example.eureka.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InitialBean {
    Logger logger = LoggerFactory.getLogger(InitialBean.class);
    public InitialBean() {
        logger.info("初始化InitialBean");
    }
}
