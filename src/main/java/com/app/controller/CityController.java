package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.City;
import com.app.service.CityService;

@RestController
public class CityController {
	
	@Autowired
	private CityService service;

	@PostMapping("/city")
	public City saveCity(@RequestBody City city) {
		return service.saveCity(city);
	}

	@GetMapping("/city/{id}")
	public City getCity(@PathVariable Integer id) {
		return service.getCity(id);
	}
	
	@DeleteMapping("/city/{id}")
	public void deleteCity(@PathVariable Integer id) {
		service.deleteCity(id);
	}
	
	@PutMapping("/city")
	public City updateCity(@RequestBody City city) {
		return service.updateCity(city);
	}
}
