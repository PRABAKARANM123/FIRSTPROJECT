package collection_2_Rivice;

public class Bike {
	private String brand;
	private int price;
	private String noPlate;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNoPlate() {
		return noPlate;
	}
	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Bike(String brand, int price, String noPlate, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.noPlate = noPlate;
		this.color = color;
	}
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", noPlate=" + noPlate + ", color=" + color + "]";
	}
	
	

}
