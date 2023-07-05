package com.springboot.example.demo;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//Test Case
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {
	
	@Test
	@Order(1)
	public void testSave() {
		System.out.println("Hello-Save");
	}
	
	@Test
	@Order(3)
	public void testUpdate() {
		System.out.println("Hello-Update");
	}
	
	@Test
	@Order(2)
	public void testDelete() {
		System.out.println("Hello-Delete");
	}
}
