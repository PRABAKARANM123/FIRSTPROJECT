package Object;

public class Cardetails {
	public static void main(String[]args)
	{
		Car c1=new Car();
		c1.brand="TATA";
		c1.price=400000;
		c1.colour="white";
		c1.taxAmount=50000;
		c1.isAirBags=true;
		c1.netPrice=c1.price+c1.taxAmount;
		System.out.println(c1.brand);
		System.out.println(c1.netPrice);
		
		Car c2=new Car();
		c2.brand="honda";
		c2.price=600000;
		c2.colour="black";
		c2.taxAmount=50000;
		c2.isAirBags=true;
		c2.netPrice=c2.price+c2.taxAmount;
		System.out.println(c2.brand);
		System.out.println(c2.netPrice);
		
		
		
		
		
	}

}
