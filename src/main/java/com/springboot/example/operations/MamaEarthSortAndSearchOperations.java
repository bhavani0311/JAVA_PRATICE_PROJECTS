package com.springboot.example.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.springboot.example.model.MamaEarthProducts;
import com.springboot.example.repository.MamaEarthProductsRepository;

@Component
public class MamaEarthSortAndSearchOperations {
	
	@Autowired
	MamaEarthProductsRepository repo;
	
	public List<MamaEarthProducts> sortByField(int page, int pageSize,
			String classifyByCategory,String classifyByGender, String sortByPrice,
			String sortByAvalibity, String sortByRating){
		
		List<MamaEarthProducts> products = null;
		
		if(classifyByCategory !=null) {
			
			Pageable pageable = PageRequest.of(page, pageSize);
			
			products = repo.findAllByCategory
					(pageable,classifyByCategory).toList();
			
		}
		else if(sortByRating!=null) {
			
			products = repo.findAll(PageRequest.of(page, pageSize)
					.withSort(Sort.by(Sort.Direction.DESC,sortByRating))).toList();
			
		}
		else if(sortByAvalibity!=null) {
			
			Pageable pageable = PageRequest.of(page, pageSize);
			
			Boolean b = new Boolean(sortByAvalibity);
			
			products = repo.findAllByAvalibility(pageable,b).toList();
			
		}
		else if(sortByPrice!=null) {
			
			products = repo.findAll(PageRequest.of(page, pageSize)
					.withSort(Sort.by(Sort.Direction.ASC,sortByPrice))).toList();
			
		}
		else if(classifyByGender!=null) {
			
			    Pageable pageable = PageRequest.of(page, pageSize);
				products = repo.findAllByGender(pageable,classifyByGender).toList();
				
		}
		else {
			
			products = repo.findAll(PageRequest.of(page, pageSize)).toList();
		}
		
		
		return products;
			   
	}
}
