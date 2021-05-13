package com.demo.family;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyApplication.class, args);
	}



}
