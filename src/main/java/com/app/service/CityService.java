package com.app.service;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.app.entity.City;
import com.app.repository.CityRepository;

@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;

	public City saveCity(City city) {

		return cityRepository.save(city);
	}

	@Cacheable(cacheNames="cities", key="#id")
	public City getCity(Integer id) {

		return cityRepository.findById(id).get();
	}
	
	@CacheEvict(cacheNames="cities", key="#id")
	public void deleteCity(Integer id) {
		
		cityRepository.deleteById(id);

	}
	
	@CachePut(cacheNames="cities", key="#city.id")
	public City updateCity(City city) {
		
		City c = cityRepository.findById(city.getId()).get();
		if(c!=null) {
			c.setName(city.getName());
		}
		
		cityRepository.save(c);
		
		return c;
	}
}
