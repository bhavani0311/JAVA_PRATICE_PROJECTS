package com.springboot.example.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.example.model.Product;
import com.springboot.example.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public void saveAllProducts() {
		List<Product> products = IntStream.rangeClosed(1, 200)
				.mapToObj(i-> new Product(i,"product"+i, new Random().nextInt(100), new Random().nextInt(100)))
				.collect(Collectors.toList());
		repository.saveAll(products);
	}
	
	public List<Product> findAllProducts(){
		return repository.findAll();
	}
	
	public List<Product> findProductsWithSorting(String field){
		return repository.findAll(Sort.by(Sort.DEFAULT_DIRECTION.ASC,field));
	}
	
	public Page<Product> findProductsWithPagination(int offset,int pageSize){ 
			Page<Product> products = repository.findAll(PageRequest.of(offset, pageSize));
			return products;	
	}
	
	public Page<Product> findProductsWithPaginationAndSorting(int offset,int pageSize,String field){ 
		Page<Product> products = repository.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
		return products;	
}

}
