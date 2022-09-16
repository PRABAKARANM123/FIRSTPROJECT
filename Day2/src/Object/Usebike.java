package Object;

public class Usebike {
	public static void main(String[]args)
	{
		Bike B=new Bike();
		B.brand="Hero";
		B.price=80000;
		B.colour="Red";
		B.discountAmount=3000;
		B.isTubeLess=true;
		B.netPrice=(B.price-B.discountAmount);
		System.out.println(B.brand);
		System.out.println(B.netPrice);
		
		Bike C=new Bike();
		C.brand="Bajaj";
		C.price=70000;
		C.colour="Green";
		C.discountAmount=4000;
		C.isTubeLess=true;
		C.netPrice=C.price-C.discountAmount;
		System.out.println(C.brand);
		System.out.print(C.netPrice);
		
		
		
		
	}

}
