package com.springboot.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.example.entities.Employee;

@Repository
public interface employeeRepository extends JpaRepository<Employee,Long>{
	
}
