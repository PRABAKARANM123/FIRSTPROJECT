package conditionsInsideObject;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.brand = "TVS";
		bike1.price = 70000;
		bike1.color = "Red";
		bike1.taxPrice = 5;
		
		Bike bike2 = new Bike();
		bike2.brand = "YAMAHA";
		bike2.price = 250000;
		bike2.color = "White";
		bike2.taxPrice = 10;
		
		Bike bike3 = new Bike();
		bike3.brand = "BAJAJ";
		bike3.price = 75000;
		bike3.color = "Black";
		bike3.taxPrice = 4;
		
		Bike bike4 = new Bike();
		bike4.brand = "OLA";
		bike4.price = 95000;
		bike4.color = "Gold";
		bike4.taxPrice = 7;
		if (bike1.price>=200000) {
			System.out.println("NetPrice = "+(bike1.price+(bike1.price*bike1.taxPrice/100)));
			System.out.println(bike1.brand);
		}
		else if(bike2.price>=200000) {
			System.out.println("NetPrice = "+(bike2.price+(bike2.price*bike2.taxPrice/100)));
			System.out.println(bike2.brand);
		
		}
		else if(bike3.price>=200000) {
			System.out.println("NetPrice = "+(bike3.price+(bike3.price*bike3.taxPrice/100)));
			System.out.println(bike3.brand);
		}
		else if(bike4.price>=200000) {
			System.out.println("NetPrice = "+(bike4.price+(bike4.price*bike4.taxPrice/100)));
			System.out.println(bike4.brand);
		}
		else {
			System.out.println("Data Invalid");
		}
		
	}

}
