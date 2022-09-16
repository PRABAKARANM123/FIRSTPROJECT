package constructor;

public class Laptop2 extends Desktop2 {
	String brand;
	int price;
    int ram;
	public Laptop2() {
		System.out.println("DEL LAP");
	}
	public Laptop2(String brand, int price, int ram, boolean isMonitor, String type) {
		super(type, isMonitor);
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		System.out.println(brand+" : "+price+" : "+ram);
	}
	public static void main(String[] args) {
		//Laptop1 lap2 = new Laptop1();
		Laptop2 lap2 = new Laptop2("HP", 70000, 8, true, "OLD TYPE");
		System.out.println("PRICE : "+lap2.price);
		//Laptop2 lap2 = new Laptop2("OLD TYPE", true)
	}

}
