package polymorpisam;

public class UseCar_1 {
	public static void main(String[] args) {
		Engine eng1 = new Engine("TAengine", 10000, "T120");
		Engine eng2 = new Engine("HOengine", 20000, "H420");
		Engine eng3 = new Engine("BMwengine", 45000, "BMW70");
		
		Car_1 car1 = new Car_1("TATA", 500000, eng1);
		Car_1 car2 = new Car_1("HONDA", 650000, eng2);
		Car_1 car3 = new Car_1("BMW", 200000, eng3);
		
		
		Car_1[] cars = {car1, car2,car3};
//		for(Car_1 ca:cars) {
//			System.out.println(ca.getBrand());
//			System.out.println(ca.getEngine());
//		}
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i].getEngine());
		}
	}

}
