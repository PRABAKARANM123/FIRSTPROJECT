package polymorpisam;

public class Car {
	String brand;
	int price;
	
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String toString() {
		return "Brand : "+brand+", Price : "+price;
	}
	
	public String showSpeed(int cc) {
		return "Car Speed Is : "+cc+", Km";
	}

}
