package org.prueba;

public class Product {
	protected double price;
	
	public Product (double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}