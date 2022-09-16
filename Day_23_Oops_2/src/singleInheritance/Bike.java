package singleInheritance;

public class Bike {
	private String brand;
	private int price;
	String color;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public int findNetPrice(int taxPrice) {
		return price+(price*taxPrice/100);
	}
	
	
	public Bike(String brand, int price, String color) {
		this.price = price;
		this.brand = brand;
		this.color = color;
	}
	
	public String toString() {
		return "Brand : "+brand+", Price : "+price+", Color : "+color;
	}

}
