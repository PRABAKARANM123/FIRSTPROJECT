package constructor;

public class Laptop1 extends Desktop1 {
	String brand;
	int price;
    int ram;
	public Laptop1() {
		System.out.println("DEL LAP");
	}
	public Laptop1(String brand, int price, int ram) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		System.out.println(brand+" : "+price+" : "+ram);
	}
	public static void main(String[] args) {
		//Laptop1 lap1 = new Laptop1();
		Laptop1 lap2 = new Laptop1("HP", 70000, 8);
	}
}
