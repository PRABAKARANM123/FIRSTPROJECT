package functions;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "TATA";
		car1.price = 500000;
		car1.color = "Black";
		car1.taxAmount = 2000;
		
		Car car2 = new Car();
		car2.brand = "FORD";
		car2.price = 600000;
		car2.color = "Black";
		car2.taxAmount = 2500;
		
		Car car3 = new Car();
		car3.brand = "BMW";
		car3.price = 2000000;
		car3.color = "Black";
		car3.taxAmount = 5000;
		
		Car car4 = new Car();
		car4.brand = "AUDI";
		car4.price = 1000000;
		car4.color = "Black";
		car4.taxAmount = 4000;
		
		Car[] cars = {car1, car2, car3, car4};
		car1.findNetPrice(cars);
		car2.findMaxPrice(cars);
		
		
		
				
				
	}

}
