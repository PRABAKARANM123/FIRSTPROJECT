package Object;

public class NewPencile 
{
	public static void main(String[]args) 
	{
		
	
	Pencile p =new Pencile();
	p.brand="natraj";
	p.price=15;
	p.taxAmount=1.5f;
	p.discountAmount=1;
	p.netPrice=p.price+p.taxAmount-p.discountAmount;
	System.out.println(p.brand);
	System.out.println(p.netPrice);
	
	Pencile c=new Pencile();
	c.brand="Hero";
	c.price=10;
	c.taxAmount=1.2f;
	c.discountAmount=1;
	c.netPrice=c.price+c.taxAmount-c.discountAmount;
	System.out.println(c.brand);
	System.out.println(c.netPrice);
	
	
	
			
	
	
	}
}
