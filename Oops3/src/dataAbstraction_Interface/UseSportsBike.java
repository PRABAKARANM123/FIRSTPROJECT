package dataAbstraction_Interface;

public class UseSportsBike {
	public static void main(String[] args) {
	SportsBike sb1 = new SportsBike();
	System.out.println(sb1.speed(100));
	System.out.println(sb1.printBrand("Yamaha"));
	System.out.println(sb1.speed());
	}

}
