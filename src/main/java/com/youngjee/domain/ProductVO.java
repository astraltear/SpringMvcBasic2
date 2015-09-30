package com.youngjee.domain;

public class ProductVO {

	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	
	
	
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductVO[name="+name+",price="+price+"]";
	}
	
	
}