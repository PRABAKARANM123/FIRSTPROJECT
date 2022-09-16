package encapsulationRivice;

public class Laptop {
	private String brand;
	private int price;
	private Battery battery;
	
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
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public Battery grtBattery() {
		return battery;
		
	}
	
	public Laptop(String brand, int price, Battery battery) {
		this.brand = brand;
		this.price = price;
		this.battery = battery;
	}
	
	public String toString() {
		return brand+" "+price+" "+battery;
	}

}
