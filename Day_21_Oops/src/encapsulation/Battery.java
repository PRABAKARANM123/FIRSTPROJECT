package encapsulation;

public class Battery {
	private String brand;
	private int price;
	private int capacity;
	
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
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	

}
