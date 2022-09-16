package Test_ThisKeyWord;

public class Laptop extends Desktop {
	public Laptop(String brand) {
		//super(brand);
		System.out.println(brand);
	}
	public Laptop() {
		System.out.println("Charge");
	}
	public static void main(String[] args) {
		Laptop lenovo = new Laptop();
		//Laptop lap2 = new Laptop("Dell");
	}

}
