package for2and3;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Ford";
		car1.price = 700000;
		car1.colour = "Black";
		
		Car car2 = new Car();
		car2.brand = "Tata";
		car2.price = 1000000;
		car2.colour = "white";
		 
		Car car3 = new Car();
		car3.brand = "Skoda";
		car3.price = 1500000;
		 
		Car[] cars = new Car[3];  //<-- Indivitual Initialisation
		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		
		int sum = 0;
		for(int i =0; i<cars.length; i++) {
			System.out.println(cars[i].brand.toUpperCase());
			sum = sum+cars[i].price;
			
		}
		System.out.println("Total price of all cars : "+sum);
	}

}
