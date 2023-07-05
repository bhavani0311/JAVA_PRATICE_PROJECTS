package com.springboot.example.demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Annotations_3 {
	
	@Test
	@Tag("prod")
	public void production() {
		System.out.println("Im Production");
	}
	@Test
	@Tag("dev")
	public void development() {
		System.out.println("Im Dev");
	}
}
