package com.springboot.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Assertions_1 {
	
	@Test
	public void testAssertEquals() {
		String actual = "HELLO";
		String expected = "HELLOS";
		
		//Assertions.assertEquals(expected, actual);
		
		Assertions.assertEquals(expected, actual, "values are not equal");
		
		
		
	}
}
