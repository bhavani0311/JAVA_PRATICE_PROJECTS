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

/*create database bootsecure;

create table usertab(uid int,uname varchar(30), upwd varchar(70),
					urole varchar(20), uenabled int);
					
select * from usertab;

insert into usertab values(10,'sam','$2a$10$tXcTlxnN5EaQZmULMFOy9u.QpAO0O6bYzVthRQPYy1YJg3JOyN8Bm',
						   'ADMIN',1);

insert into usertab values(11,'syed','$2a$10$lBEUH.478vN2updt0MHEXuxGsmDMqyXWBf8fatuEi25rKei59UwUC',
						   'EMPLOYEE',1);

insert into usertab values(12,'sai','$2a$10$.qdw6cCyTdgeAAMghUsqKOSMIBEjqUPVKlQbO5MXWl1v6FVY.4pUi',
						   'STUDENT',1);
						   
select * from usertab;

commit;*/

