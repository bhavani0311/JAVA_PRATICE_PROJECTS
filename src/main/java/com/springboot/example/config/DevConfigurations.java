package com.springboot.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;

@Profile("dev")
@Configuration
public class DevConfigurations {
	
	@PostConstruct
	public void test() {
		System.out.println("This is Dev Configurations");
	}
}
