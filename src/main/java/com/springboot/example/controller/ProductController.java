package com.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.model.Product;
import com.springboot.example.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/saveAll")
	public String saveAllProducts() {
		service.saveAllProducts();
		return "saved all products";
	}
	
	@GetMapping("/fetchProducts")
	public List<Product> findAllProducts(){
		return service.findAllProducts();
	}
	
	@GetMapping("/fetchProductsWithSorting/{field}")
	public List<Product> findProductsWithSorting(@PathVariable String field){
		return service.findProductsWithSorting(field);
	}
	
	@GetMapping("/fetchProductsWithPagination/{offset}/{pageSize}")
	public Page<Product> findProductsWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		return service.findProductsWithPagination(offset, pageSize);
	}
	
	@GetMapping("/fetchProductsWithPS/{offset}/{pageSize}/{field}")
	public Page<Product> findProductsWithPaginationAndSorting
	(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
		return service.findProductsWithPaginationAndSorting(offset, pageSize, field);
	}

}
