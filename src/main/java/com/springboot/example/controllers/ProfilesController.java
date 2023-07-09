package com.springboot.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfilesController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
