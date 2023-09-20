package com.cotamacae.order.services;

import com.cotamacae.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderCalculationTotal {
	
	private OrderService orderService;
	private ShippingService shippingService;
	private Order order;
	
	
	public OrderCalculationTotal() {
		
	}

	public OrderCalculationTotal(OrderService orderService, ShippingService shippingService, Order order) {
		this.orderService = orderService;
		this.shippingService = shippingService;
		this.order = order;
	}

	public double discountPrice(Order order) {
		return order.getBasic() + shippingService.shipping(order.getBasic()) - order.getDiscount(order) ;

	}

}
