package com.springboot.example.testService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import com.springboot.example.entities.Order;
import com.springboot.example.service.OrderService;

public class TestOrderService {
	
	  @Test
      public void testSave() {
		  
		OrderService mockService = PowerMockito.mock(OrderService.class);
		
		Order order = new Order(1,"Tank Top");
		
		PowerMockito.when(mockService.save(order)).thenReturn(order);
		
		OrderService service = new OrderService(mockService);
		
		Order o = service.save(order);
		
		Assertions.assertEquals(o.getOrderName(),"Tank Top");
	}
      
      
}
