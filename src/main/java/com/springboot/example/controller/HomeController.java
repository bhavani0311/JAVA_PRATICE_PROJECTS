package com.springboot.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String showHome() {
		return "HomePage";
	}
	
	@GetMapping("/welcome")
	public String showWelcome() {
		return "Welcome Page after login";
	}
	
	@GetMapping("/admin")
	public String showAdmin() {
		return "Hi Admin";
	}
	
	@GetMapping("/emp")
	public String showEmp() {
		return "Hi Employee";
	}
	
	@GetMapping("/denied")
	public String showDenial() {
		return "You have no access to this page please logout and login with right creditionals";
	}
	
	@GetMapping("/std")
	public String showStudent() {
		return "Hi Student";
	}
	
	
	
}
