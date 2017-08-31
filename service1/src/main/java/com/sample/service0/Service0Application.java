package com.sample.service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Service0Application {

	public static void main(String[] args) {
		SpringApplication.run(Service0Application.class, args);
	}
}
