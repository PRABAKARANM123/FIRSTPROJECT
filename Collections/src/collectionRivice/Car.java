package collectionRivice;

public class Car {
	private String brand;
	private int price;
	private String color;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.color = model;
	}
	public String getModel() {
		return color;
	}
	
	public Car(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public String toString() {
		return brand+" "+price+" "+color;
	}

}
