package com.springboot.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Annotations_1 {
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Im Before Each");
	}
	
	@Test
	@DisplayName("TESTING SAVE METHOD")
	public void testSave() {
		System.out.println("Hello-Save");
	}
	
	@Test
	@DisplayName("TESTING UPDATE METHOD")
	@Disabled
	public void testUpdate() {
		System.out.println("Hello-Update");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Im After Each");
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Executed only once in this class before all testcases");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Executed only once in this class after all testcases");
	}
	
}
