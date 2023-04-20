package com.springboot.example.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.entities.Employee;
import com.springboot.example.repositories.employeeRepository;

@Service
public class employeeServiceImpl implements employeeService{
	
	@Autowired
	employeeRepository empRepository;

	public Employee saveEmployee(Employee emp) {
		return empRepository.save(emp);
	}
	
	public List<Employee> fetchEmployees() {
		List<Employee> emp = empRepository.findAll();
		return emp;
	}
	
	public Optional<Employee> fetchEmployeeById(Long eid) {
		Optional<Employee> emp = empRepository.findById(eid);
		return emp;
	}
	
	public Employee updateEmployeeById(Long eid, Employee emp) {
		Employee e = empRepository.findById(eid).get();
		if(Objects.nonNull(emp.getEname()) && !emp.getEname().equals("")) {
			e.setEname(emp.getEname());
		}
		return empRepository.save(e);
	}
	
	public void deleteEmployeeById(Long eid) {
		empRepository.deleteById(eid);
	}
	
	
	
}
