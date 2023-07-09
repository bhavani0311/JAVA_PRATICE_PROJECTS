package com.springboot.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import jakarta.annotation.PostConstruct;

@Profile("prod")
@Configuration
public class ProdConfigurations {
	
	@PostConstruct
	public void test() {
		System.out.println("This is Prod Configurations");
	}
}
