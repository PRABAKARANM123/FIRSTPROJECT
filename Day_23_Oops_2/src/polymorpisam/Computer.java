package polymorpisam;

public class Computer {
	String brand;
	int price;
	Cpu cpu;
	
	public Computer(String brand,int price, Cpu cpu) {
		this.brand = brand;
		this.price = price;
		this.cpu = cpu;
	}
	public String toString() {
		return brand+" "+price+" "+cpu;
	}
}
