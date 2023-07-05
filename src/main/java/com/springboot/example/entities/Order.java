package com.springboot.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_table")
public class Order {
	
	@Id
	private Integer orderId;
	
	private String orderName;
	
	public Order() {
		
	}

	public Order(Integer orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	
}
