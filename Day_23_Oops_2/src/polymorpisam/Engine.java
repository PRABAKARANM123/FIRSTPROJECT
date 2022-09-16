package polymorpisam;

public class Engine {
	private String brand;
	private int price;
	private String model;
	
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
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	public Engine(String brand, int price, String model) {
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	
	public String toString() {
		return "Brand: "+brand+", Price: "+price+", Model: "+model;
	}

}
