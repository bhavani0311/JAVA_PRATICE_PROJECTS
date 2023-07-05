package com.springboot.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.example.entities.Order;
import com.springboot.example.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repo;
	
	private OrderService orderService; 
	
	public OrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public Order save(Order order) {
		
		order.setOrderId(1);
		order.setOrderName("Tank top");
		
		repo.save(order);
		return repo.findById(order.getOrderId()).get();
	}
}
