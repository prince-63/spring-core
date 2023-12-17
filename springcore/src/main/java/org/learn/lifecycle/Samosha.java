package org.learn.lifecycle;

public class Samosha {
	private double price;

	public Samosha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("initialize the price");
	}

	@Override
	public String toString() {
		return "Samosha [price=" + price + "]";
	}
	
	// life cycle
	public void init() {
		System.out.println("initalizing application");
	}
	
	public void destroy() {
		System.out.println("destroying application");
	}
}
