package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 再次测试推送
 */
@SpringBootApplication
@EnableEurekaServer
public class ZhustEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhustEurekaApplication.class, args);
	}

}