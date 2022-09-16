 package for2and3;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.brand = "Hero";
		bike1.price = 80000;
		bike1.colour = "Green";
		bike1.taxAmount = 2000;
		
		Bike bike2 = new Bike();
		bike2.brand = "TVS";
		bike2.price = 70000;
		bike2.colour = "Yellow";
		bike2.taxAmount = 1500;
		
		Bike bike3 = new Bike();
		bike3.brand = "YAMAHA";
		bike3.price = 100000;
		bike3.taxAmount = 3000;
		
		Bike[] bikes = {bike1,bike2,bike3};   //<-- Bulk Initialization
		for(int i=0; i<bikes.length; i++) {
			System.out.println(bikes[i].brand);
			System.out.println(bikes[i].price+bikes[i].taxAmount);
			
			
		}
	}

}
