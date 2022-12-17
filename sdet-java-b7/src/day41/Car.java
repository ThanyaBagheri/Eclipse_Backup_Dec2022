package day41;

/*
 * TODO encapsulate Car class
 * 1. Make properties private
 * 2. Provide setters and getters for all properties 
 */
public class Car {
	private String model;
	private double price;
	private int year;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price ) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		
		this.price = price;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if (year < 2000) {
			throw new IllegalArgumentException("We don't accept cars before 2000");
		}
		
		this.year = year;
	}	
}	
