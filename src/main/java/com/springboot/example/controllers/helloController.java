package com.springboot.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.entities.Employee;
import com.springboot.example.services.employeeService;

@RestController
public class helloController {
	
	@Autowired
	employeeService empService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "HW";
	}
	
	@RequestMapping(value = "test/springbootapplication/saveEmployee", method = RequestMethod.POST, consumes = "application/json")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empService.saveEmployee(emp);
	}
	
	@RequestMapping(value = "/test/springbootapplication/findEmployees", method = RequestMethod.GET)
	public List<Employee> findEmployees() {
		return empService.fetchEmployees();
	}
	
	@RequestMapping(value = "/test/springbootapplication/findEmployeeById/{id}", method = RequestMethod.GET)
	public Optional<Employee> findEmployeeById(@PathVariable("id") Long eid) {
		return empService.fetchEmployeeById(eid);
	}
	
	@PutMapping("/test/springbootapplication/updateEmployeeId/{id}")
	public Employee updateEmployeeById(@PathVariable("id") Long eid,
			@RequestBody Employee emp) {
		return empService.updateEmployeeById(eid, emp);
	}
	
	@DeleteMapping("/test/springbootapplication/deleteEmployeeById/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long eid) {
		empService.deleteEmployeeById(eid);
		return "record got deleted";
	}
}
