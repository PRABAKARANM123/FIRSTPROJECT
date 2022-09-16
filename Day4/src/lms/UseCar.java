package lms;

public class UseCar {
	public static void main(String[]args)
	{
		String[] value1=args[0].split("_");
		String[] value2=args[1].split("_");
		String[] value3=args[2].split("_");
		
		Car car1=new Car();
		car1.brand=value1[0];
		car1.price=Integer.parseInt(value1[1]);
		car1.colour=value1[2];
		car1.discoundAmound= car1.price*5/100;
		car1.taxAmound=car1.price*10/100;
		car1.netPrice=car1.price+car1.taxAmound-car1.discoundAmound;
		System.out.println("Car1 BrandName : "+car1.brand+",");
		
		
	}

}





class Car {
	String brand;
	int price;
	String colour;
	int discoundAmound;
	int taxAmound;
	int netPrice;
}
