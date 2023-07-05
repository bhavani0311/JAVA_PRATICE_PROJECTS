package com.springboot.example.DTOs;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Component
public class MamaEarthProductsDTO {
	
    private Integer mId;
	
	private String name;
	
	@NotBlank(message = "Category cant be empty")
    @NotNull(message = "Category cant be null")
	private String category;
	
	private Double price;
	
	@NotBlank(message = "gender cant be empty")
    @NotNull(message = "gender cant be null")
	private String gender;
	
	private String popularity;
	
	private Boolean avalibility;
	
	@Min(value = 0, message = "rating can be less than 0")
    @Max(value = 5, message = "rating cant be more than 5")
	private Integer rating;
	
	public MamaEarthProductsDTO() {
		
	}

	public MamaEarthProductsDTO(Integer mId, String name,
			@NotBlank(message = "Category cant be empty") @NotNull(message = "Category cant be null") String category,
			 Double price,
			@NotBlank(message = "gender cant be empty") @NotNull(message = "gender cant be null") String gender,
			String popularity,
			Boolean avalibility,
			@Min(value = 0, message = "Invalid Age: Equals to zero or Less than zero") @Max(value = 5, message = "Invalid Age: Exceeds 100 years") Integer rating) {
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
