package com.cotamacae.order.services;


import com.cotamacae.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	private double total;
	private Order order;
	
	
	public OrderService() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderService( Order order) {
		this.total = total;
		this.order = order;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
