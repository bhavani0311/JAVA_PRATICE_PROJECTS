package com.springboot.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.model.MamaEarthProducts;

@Repository
public interface MamaEarthProductsRepository extends JpaRepository<MamaEarthProducts,Integer>{
	
	public Page<MamaEarthProducts> findAllByCategory(Pageable pageable, String category); 
	
	public Page<MamaEarthProducts> findAllByAvalibility(Pageable pageable,Boolean b);
	
	public Page<MamaEarthProducts> findAllByGender(Pageable pageable,String gender);
}
