package com.springboot.example.demo;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(Alphanumeric.class)
public class TestEmployee_Alphanumeric_Order {
	
	@Test
	public void testASave() {
		System.out.println("Hello-Save");
	}
	
	@Test
	public void testBUpdate() {
		System.out.println("Hello-Update");
	}
	
	@Test
	public void testCDelete() {
		System.out.println("Hello-Delete");
	}
}
