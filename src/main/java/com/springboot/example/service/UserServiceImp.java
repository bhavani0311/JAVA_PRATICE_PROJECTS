package com.springboot.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.model.User;
import com.springboot.example.repository.UserRepository;

@Service
public class UserServiceImp implements IUserService{
	
	@Autowired
	private UserRepository repo;
	
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getUid();
	}
}
