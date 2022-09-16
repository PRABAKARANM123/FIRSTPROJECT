package functions;

public class Car {
	String brand;
	int price;
	String color;
	int taxAmount;
	
	
	public void findNetPrice(Car[] c) {
		for(int i=0; i<c.length; i++) {
			System.out.println("Net Price : "+(c[i].price+c[i].taxAmount));
		} }
		public void findMaxPrice(Car[] m) {
			int max = 0;
			for(int i=0; i<m.length; i++) {
				if(m[i].price>max) {
					max = m[i].price;
					//System.out.println(max);
				}
			}
			System.out.println(max);
		
	}

}
