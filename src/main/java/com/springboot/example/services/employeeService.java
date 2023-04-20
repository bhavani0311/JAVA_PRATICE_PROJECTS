package com.springboot.example.services;

import java.util.List;
import java.util.Optional;

import com.springboot.example.entities.Employee;

public interface employeeService {
	
	public Employee saveEmployee(Employee emp);
	
	public List<Employee> fetchEmployees();
	
	public Optional<Employee> fetchEmployeeById(Long eid);
	
	public Employee updateEmployeeById(Long eid, Employee emp);
	
	public void deleteEmployeeById(Long eid);
}
