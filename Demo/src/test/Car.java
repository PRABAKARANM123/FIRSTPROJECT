package test;

public class Car {
	private String brand;
	private int price;
	private  Engine engine;
	
//	public Car(String brand, int price, String enginecc) {
//		this.brand = brand;
//		this.price = price;
//		this.enginecc = enginecc;
//	}
	
	public Car(String brand, int price, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.engine = engine;
	}
	public String toString() {
		return brand+" "+price+" "+engine;
	}

}
