package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动一个服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaSampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCloudEurekaSampleApplication.class, args);
		new SpringApplicationBuilder(SpringCloudEurekaSampleApplication.class).web(true).run(args);
	}
}
