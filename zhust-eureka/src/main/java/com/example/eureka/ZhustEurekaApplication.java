package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * fsfdfss
 */
@SpringBootApplication
@EnableEurekaServer
public class ZhustEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhustEurekaApplication.class, args);
	}

}
