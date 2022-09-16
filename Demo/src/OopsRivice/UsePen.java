package OopsRivice;

public class UsePen {
	public static void main(String[] args) {
		Refill refill1 = new Refill("Camlin", 50, "Blue");
		Pen pen1 = new Pen("Natraj", 80, refill1);
		
		System.out.println(pen1.brand);
		System.out.println(pen1.refill.brand);
	}

}
