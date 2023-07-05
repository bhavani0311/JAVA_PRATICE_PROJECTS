package com.springboot.example.validations;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.example.DTOs.MamaEarthProductsDTO;
import com.springboot.example.model.MamaEarthProducts;
import com.springboot.example.repository.MamaEarthProductsRepository;

@Component
public class MamaEarthValidations {
	
	@Autowired
	MamaEarthProductsRepository repo;
	
	public enum categoryEnum {
	    HAIR,SKIN
	}
	public enum PopularityEnum {
	    GREAT,GOOD,NONE
	}
	public enum genderEnum{
		FEMALE,MALE
	}
	
	public void generalValidations(MamaEarthProductsDTO product) throws Exception {
		
		try {
	         categoryEnum.valueOf(product.getCategory()); 
	  
	        } 
		catch (IllegalArgumentException e) {
	           throw new IllegalArgumentException("Invalid Category");
	        }  
		
		try {
			PopularityEnum.valueOf(product.getPopularity()); 
	  
	        } 
		catch (IllegalArgumentException e) {
	           throw new IllegalArgumentException("Invalid popularity type");
	        } 
		
		try {
			genderEnum.valueOf(product.getGender()); 
	  
	        } 
		catch (IllegalArgumentException e) {
	           throw new IllegalArgumentException("Invalid Gender type");
	        } 
		
	}
	
	
    public void fetchingValidations(
			String classifyByCategory,String classifyByGender, String sortByPrice,
			String sortByAvalibity, String sortByRating) throws Exception {
		if(classifyByCategory!=null) {
    	try {
	         categoryEnum.valueOf(classifyByCategory); 
	  
	        } 
		catch (IllegalArgumentException e) {
	           throw new IllegalArgumentException("Invalid Category,please fetch with either HAIR or SKIN");
	        }  
		}
		if(classifyByGender!=null) {
		try {
			genderEnum.valueOf(classifyByGender); 
	  
	        } 
		catch (IllegalArgumentException e) {
	           throw new IllegalArgumentException("Invalid Gender type,please fetch with either MALE OR FEMALE");
	        } 
		}
		
			
	}
	
	
	
	
	
}
