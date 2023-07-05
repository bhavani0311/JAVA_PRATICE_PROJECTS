package com.springboot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.springboot.example.model.Product;
import com.springboot.example.repository.ProductRepository;

@Service
public class ProductFetchingService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findProducts(int offset,int pageSize,String field1, String field2){
		
		if(field1 != null && field2 !=null) {
				return repository.findAll(PageRequest.of(offset, pageSize)
						.withSort(Sort.by(field1).and(Sort.by(field2))))
						.toList();
			}
		else if(field1!=null && field2 == null) {
			return repository.findAll(PageRequest.of(offset, pageSize)
					.withSort(Sort.by(field1)))
					.toList();
		}
		else if(field1==null && field2 != null) {
			return repository.findAll(PageRequest.of(offset, pageSize)
					.withSort(Sort.by(field2)))
					.toList();
		}
		else {
			return repository.findAll(PageRequest.of(offset, pageSize)).toList();
		}
		
	}
	
	
	

}
