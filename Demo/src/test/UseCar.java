package test;

public class UseCar {
	public static void main(String[] args) {
		Engine eng1 = new Engine("TATA", 200000, "1200CC");
		Car car1 = new Car("Hundai", 500000, eng1);
		System.out.println(car1);
		System.out.println(eng1);
		
	}

}
