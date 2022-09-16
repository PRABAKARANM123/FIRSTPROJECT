package Object;

public class UseAc {
	public static void main(String[]args)
	{
		Ac a=new Ac();
		a.brand="STAR";
		a.colour="white";
		a.price=35000;
		a.taxAmount=5;
		//a.taxPercent=a.price*a.taxAmount/100;
		//a.netAmount=a.price+a.taxPercent;
		System.out.println(a.brand);
		//System.out.println(a.netAmount);
		
		
		System.out.println("NET PRICE = "+(a.price+a.price*5/100));
		
		
		
	}

}
