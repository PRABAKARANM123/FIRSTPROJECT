package test;

public class Engine {
	private String brand;
	private int price;
	private  String cc;
	
	public Engine(String brand, int price, String cc) {
		this.brand = brand;
		this.price = price;
		this.cc = cc;
	}
	
	public String toString() {
		return price+" "+cc+" "+brand;
	}
	

}
