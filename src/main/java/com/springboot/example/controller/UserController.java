package com.springboot.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.model.User;
import com.springboot.example.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService service;
	//1. show Register Page
	@GetMapping("/reg")
	public String showReg() {
		return "UserRegister";
	}
	
	//2. Read Form Data for save Operation
	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute User user,
			Model model) {
		
		Integer id = service.saveUser(user);
		String msg="User Saved with ID "+id;
		model.addAttribute("message", msg);
		
		return "UserRegister";
	}

}
