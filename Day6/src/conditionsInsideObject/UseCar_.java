package conditionsInsideObject;

public class UseCar_ {
	public static void main(String[] args) {
		Car_ car1 = new Car_();
		car1.brand = "HONDA";
		car1.price = 400000;
		car1.color = "black";
		
		Car_ car2 = new Car_();
		car2.brand = "TATA";
		car2.price = 500000;
		car2.color = "white";
		
		if(car1.color.contains("a")||car1.color.contains("e")||car1.color.contains("i")||car1.color.contains("o")||car1.color.contains("u")) {
			System.out.println("car1 contains vowels");
		}
		else if  (car2.color.contains("a")||car2.color.contains("e")||car2.color.contains("i")||car2.color.contains("o")||car2.color.contains("u")) {
			System.out.println("car2 contains vowels");
		}
		{
		
	}

	}
}
