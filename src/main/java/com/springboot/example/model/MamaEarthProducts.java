package com.springboot.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mamaearth_product_table")
public class MamaEarthProducts {
	
	@Id
	private Integer mId;
	
	private String name;
	//hair, skin
	private String category;
	
	private Double price;
	
	private String gender;
	
	private String popularity;
	
	private Boolean avalibility;
	
	private Integer rating;
	
	public MamaEarthProducts(){
		
	}

	public MamaEarthProducts(Integer mId, String name, String category, Double price, String gender, String popularity,
			Boolean avalibility, Integer rating) {
		super();
		this.mId = mId;
		this.name = name;
		this.category = category;
		this.price = price;
		this.gender = gender;
		this.popularity = popularity;
		this.avalibility = avalibility;
		this.rating = rating;
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPopularity() {
		return popularity;
	}

	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	public Boolean getAvalibility() {
		return avalibility;
	}

	public void setAvalibility(Boolean avalibility) {
		this.avalibility = avalibility;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	
	
	
	
	
}
