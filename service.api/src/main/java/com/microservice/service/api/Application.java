package com.microservice.service.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "com.microservice.service")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
