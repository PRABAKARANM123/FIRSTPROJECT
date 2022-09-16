package conditionsInsideObject;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Honda";
		car1.price = 200000;
		car1.color = "Black";
		car1.isAutomaticGear = false;
		
		Car car2 = new Car();
		car2.brand = "BMW";
		car2.price = 500000;
		car2.color = "White";
		car2.isAutomaticGear = true;
		
		/*if (car1.price>car2.price) {
			System.out.println(car1.price+" is maximum");
		}
			else {
				System.out.println(car2.price+" is maximum");
				
				
			}*/
		
		Car car3 = new Car();
		car3.brand = "Honda";
		car3.price = 400000;
		car3.color = "RED";
		car3.isAutomaticGear = false;
		
		if (car3.isAutomaticGear==true) {
			System.out.println(car3.price+(car3.price*5/100));
		}
			else {
				System.out.println(car3.price-(car3.price*7/100));
			}
		}
		}
	


