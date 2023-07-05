package com.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.DTOs.MamaEarthProductsDTO;
import com.springboot.example.model.MamaEarthProducts;
import com.springboot.example.model.ResponseModel;
import com.springboot.example.populators.MamaEarthProductPopulator;
import com.springboot.example.service.MamaEarthProductService;
import com.springboot.example.validations.MamaEarthValidations;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/mamaearth")
public class MamaEarthProductController {
	
	@Autowired
	MamaEarthValidations validations;
	
	@Autowired
	MamaEarthProductService service;
	
	@Autowired
	MamaEarthProductPopulator populator;
	
	@PostMapping()
	public ResponseEntity<?> saveProduct(@RequestBody @Valid MamaEarthProductsDTO product) throws Exception {
		
		    validations.generalValidations(product);
		
			return new ResponseEntity<>(service.saveProduct(product), HttpStatus.CREATED);
	}
	//1. pass order for sorting
	//2. validation framework
	@GetMapping()
	public ResponseEntity<?> findProducts(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "2") int pageSize,
			@RequestParam(required = false) String classifyByCategory,
			@RequestParam(required = false) String sortByPrice,
			@RequestParam(required = false) String classifyByGender,
			@RequestParam(required = false) String sortByAvalibity,
			@RequestParam(required = false) String sortByRating) throws Exception {
		
		
		validations.fetchingValidations(classifyByCategory, 
				classifyByGender, sortByPrice, sortByAvalibity, sortByRating);
		
        
        return new ResponseEntity<>(service.fetchProducts(page,pageSize,classifyByCategory, classifyByGender, sortByPrice,
    				sortByAvalibity,sortByRating), HttpStatus.OK);
        
		
	}
	
}
