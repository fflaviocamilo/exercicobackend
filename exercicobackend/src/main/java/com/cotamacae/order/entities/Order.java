package com.cotamacae.order.entities;


public class Order {
	
	private  Integer code;
	private  double basic;
	private  double discount;
	
	
	public Order () {
		
	}
	
	public Order(Integer numeroPedido, double basic, double discount) {
		this.code =  numeroPedido;
		this.basic = basic;
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getDiscount(Order order) {
		return  order.basic * order.discount / 100 ;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
