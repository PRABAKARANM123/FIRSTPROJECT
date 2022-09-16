package For_5_ObjectArrayUsingForLoopWithCondition;

public class UseMobile {
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile();
		mobile1.brand = "Mi";
		mobile1.price = 20000;
		mobile1.model = "Note-13";
		mobile1.isTouchScreen = true;
		
		Mobile mobile2 = new Mobile();
		mobile2.brand = "Samsung";
		mobile2.price = 65000;
		mobile2.model = "A2";
		mobile2.isTouchScreen = true;
		
		Mobile mobile3 = new Mobile();
		mobile3.brand = "Apple";
		mobile3.price = 70000;
		mobile3.model = "13-Pro";
		mobile3.isTouchScreen = false;
		
		Mobile[] mobiles = {mobile1, mobile2, mobile3};
		for(int i=0; i<mobiles.length; i++) {
			if(mobiles[i].isTouchScreen==true) {
				System.out.println("Brand : "+mobiles[i].brand.toUpperCase()+", Model : "+mobiles[i].model.toUpperCase());
			}
		}
	}

}
