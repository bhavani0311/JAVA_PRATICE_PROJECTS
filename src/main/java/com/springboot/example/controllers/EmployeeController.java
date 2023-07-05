package com.springboot.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.entities.Employee;
import com.springboot.example.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@RequestMapping("/hello")
	public String helloworld() {
		return "Hello World";
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData){
		empRepository.saveAll(empData);
		return ResponseEntity.ok("Data saved");
	}
}
