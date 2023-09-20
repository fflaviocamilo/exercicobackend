package com.cotamacae.order.services;


import org.springframework.stereotype.Service;

@Service
public class ShippingService {
	
	private double shipping;
	
	public double getShipping() {
		return shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	public double  shipping(double amount) {
		if (amount < 100.00 ) {
			return 20.00;
		}else if (amount >= 101.00 && amount <= 200.00) {
			return 12.00;
		}else
			return 0;
	}
}
