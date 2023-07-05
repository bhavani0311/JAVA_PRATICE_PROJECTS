package com.springboot.example.testService;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.springboot.example.service.Message;

public class TestMessage {
	
	// Declare variables
	private Message m;
	private String expected;
	private String actualValue;
	
	//provide intial data
	@BeforeEach
	public void setUp() {
		
        expected = "Welcome SAM";
		m = new Message();
		actualValue="";
	}
	
	//Do Unit Test
	@Test
	public void testShowMsg() {
		
		actualValue = m.showMsg("SAM");
		Assertions.assertEquals(expected,actualValue);
	}
	
	//clear heap data
	@AfterEach
	public void clean() {
		m = null;
		expected=actualValue=null;
	}
}
