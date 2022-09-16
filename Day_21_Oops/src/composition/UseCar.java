package composition;

public class UseCar {
	public static void main(String[] args) {
		Engine engine = new Engine();
		engine.brand = "Ford";
		engine.price = 12000;
		engine.enginecc = 120;
		
		Car car = new Car();
		car.brand = "FordCar";
		car.price = 200000;
		car.color = "Black";
		car.engine = engine;
		
		System.out.println(car.brand);
		System.out.println(car.engine.brand);
		
	}

}
