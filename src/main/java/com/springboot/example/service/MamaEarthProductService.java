package com.springboot.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.example.DTOs.MamaEarthProductsDTO;
import com.springboot.example.model.MamaEarthProducts;
import com.springboot.example.operations.MamaEarthSortAndSearchOperations;
import com.springboot.example.populators.MamaEarthProductPopulator;
import com.springboot.example.repository.MamaEarthProductsRepository;
import com.springboot.example.validations.MamaEarthValidations;

import java.lang.reflect.Field;
@Service
public class MamaEarthProductService {
	
	@Autowired
	MamaEarthProductsRepository repo;
	
	@Autowired
	MamaEarthSortAndSearchOperations operations;
	
	@Autowired
	MamaEarthProductPopulator populator;
	
	public Integer saveProduct(MamaEarthProductsDTO product) {
		
		MamaEarthProducts mamaProduct = populator.toDTOEntity(product);
		return repo.save(mamaProduct).getmId();
		
	}
	
	public List<MamaEarthProducts> fetchProducts(int page,int pageSize,
			String classifyByCategory,String classifyByGender, String sortByPrice,
			String sortByAvalibity, String sortByRating) {
		
		List<MamaEarthProducts> products = operations.sortByField
				(page,pageSize,classifyByCategory, classifyByGender, sortByPrice,
				sortByAvalibity,sortByRating);
		
		return products;
	}
}
