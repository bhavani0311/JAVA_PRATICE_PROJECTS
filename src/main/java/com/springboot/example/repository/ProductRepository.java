package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.example.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
