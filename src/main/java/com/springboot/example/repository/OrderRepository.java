package com.springboot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.example.entities.Order;

public interface OrderRepository  extends JpaRepository<Order,Integer>{
}
