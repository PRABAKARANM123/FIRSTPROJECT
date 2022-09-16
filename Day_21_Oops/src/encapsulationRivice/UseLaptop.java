package encapsulationRivice;

public class UseLaptop {
	public static void main(String[] args) {
		Battery bat1 = new Battery("HP", 2000,"3000mah" );
		Laptop lap1 = new Laptop("lenovo", 50000, bat1);
		System.out.println(lap1);
	}

}
