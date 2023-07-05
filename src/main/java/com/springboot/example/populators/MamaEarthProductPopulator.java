package com.springboot.example.populators;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.example.DTOs.MamaEarthProductsDTO;
import com.springboot.example.model.MamaEarthProducts;

@Component
public class MamaEarthProductPopulator {
	
	public MamaEarthProducts toProduct(String category, String gender, String price,
			Boolean avalibity, Integer rating){
		
		MamaEarthProducts product = new MamaEarthProducts();
		
		if(category!=null)
		product.setCategory(category);
		if(gender!=null)
		product.setGender(gender);
		if(price!=null)
		product.setPrice(Double.parseDouble(price));
		if(avalibity!=null)
		product.setAvalibility(avalibity);
		if(rating!=null)
		product.setRating(rating);
		
		return product;
		
	}
	
	public MamaEarthProducts toDTOEntity(MamaEarthProductsDTO productDTO) {
		
		MamaEarthProducts mamaProduct=new MamaEarthProducts();
		mamaProduct.setmId(productDTO.getmId());
		mamaProduct.setName(productDTO.getName());
		mamaProduct.setCategory(productDTO.getCategory());
		mamaProduct.setGender(productDTO.getGender());
		mamaProduct.setAvalibility(productDTO.getAvalibility());
		mamaProduct.setPopularity(productDTO.getPopularity());
		mamaProduct.setPrice(productDTO.getPrice());
		mamaProduct.setRating(productDTO.getRating());
		
		return mamaProduct;
	}
}
