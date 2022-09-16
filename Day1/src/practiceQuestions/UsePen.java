package practiceQuestions;

public class UsePen {
	public static void main(String[]args)
	{
		Pen m1=new Pen();
		m1.brand="NATRAJ";
		m1.price=20;
		m1.isBlueColour=true;
		m1.tipWidth=0.5f;
		 
		Pen m2=new Pen();
        m2.brand="camel";
        m2.price=30;
        m2.isBlueColour=true;
        m2.tipWidth=0.7f;
        
        int avg=(m1.price+m2.price)/2;
        System.out.println(avg);
        
		
		
	}

}
