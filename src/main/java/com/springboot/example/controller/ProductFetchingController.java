package com.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.model.Product;
import com.springboot.example.service.ProductFetchingService;
import com.springboot.example.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductFetchingController {
	
	@Autowired
	private ProductFetchingService service;
	
	@GetMapping()
	public List<Product> findProducts(
			@RequestParam(defaultValue = "0") int offset,
			@RequestParam(defaultValue = "10") int pageSize,
			@RequestParam(required = false) String field1,
			@RequestParam(required = false) String field2){
		
		return service.findProducts(offset, pageSize, field1,field2);
		
	}
}
