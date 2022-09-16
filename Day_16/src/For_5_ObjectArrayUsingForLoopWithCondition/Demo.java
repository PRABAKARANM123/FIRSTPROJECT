package For_5_ObjectArrayUsingForLoopWithCondition;

public class Demo {
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
		
		Laptop[] laptops = {lap1, lap2, lap3};
		Laptop max = new Laptop();
		Laptop min = new Laptop();
		min.price = lap2.price;
		for(int i=0; i<laptops.length; i++) {
			if(laptops[i].price>max.price) {
				max = laptops[i];
				
			}
		}
		System.out.println(max);
	}

}
