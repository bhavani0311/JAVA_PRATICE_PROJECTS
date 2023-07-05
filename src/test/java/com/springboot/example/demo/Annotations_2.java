package com.springboot.example.demo;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Annotations_2 {
	
	@RepeatedTest(value=3)
	public void testMultiple() {
		System.out.println("Hello ");
	}
}
