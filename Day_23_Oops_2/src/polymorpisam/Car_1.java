package polymorpisam;

public class Car_1 {
	private String brand;
	private int price;
	private Engine engine;
	
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
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public Car_1 (String brand, int price, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}
	
	public String toString() {
		return "Brand: "+brand+", Price: "+price+", "+engine;
	}
}
