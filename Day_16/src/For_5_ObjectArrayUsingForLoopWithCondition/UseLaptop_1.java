package For_5_ObjectArrayUsingForLoopWithCondition;

public class UseLaptop_1 {
	public static void main(String[] args) {
		Laptop lap1 = new Laptop();
		lap1.brand = "Lenova";
		lap1.price = 60000;
		lap1.model = "le-13";
		lap1.isTouchScreen = true;
		
		Laptop lap2 = new Laptop();
		lap2.brand = "Dell";
		lap2.price = 70000;
		lap2.model = "D-Note";
		lap2.isTouchScreen = false;
		
		Laptop lap3 = new Laptop();
		lap3.brand = "HP";
		lap3.price = 75000;
		lap3.model = "Notebook 3";
		lap3.isTouchScreen = true;
		
		Laptop[] laps = {lap1, lap2, lap3};
		Laptop max = new Laptop();
		Laptop min = new Laptop();
		min.price = lap2.price;
		for(Laptop lap : laps) {
			if(lap.price>max.price) {
				max = lap;
			}
			if(lap.price<min.price) {
				min = lap;
			}
		}
		max.netPrice = max.price+(max.price*10/100);
		min.netPrice = min.price-(min.price*5/100);
		System.out.println("Brand : "+max.brand+", Price : "+max.price+", Net Price : "+max.netPrice);
		System.out.println("Brand : "+min.brand+", Price : "+min.price+", Net Price : "+min.netPrice);
		
				

	}
}
