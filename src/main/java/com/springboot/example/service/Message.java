package com.springboot.example.service;

import org.springframework.stereotype.Service;

@Service
public class Message {
	
	public String showMsg(String name)
	{
		return "Welcome "+name;
	}
}
