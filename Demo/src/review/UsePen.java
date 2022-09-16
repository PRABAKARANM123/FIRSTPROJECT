package review;

public class UsePen {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.brand = "Renalts";
		pen1.price = 50;
		pen1.color = "Red";
		
		Pen pen2 = new Pen();
		pen2.brand = "Camlin";
		pen2.price = 60;
		pen2.color = "Blue";
		
		Pen pen3 = new Pen();
		pen3.brand = "Hero";
		pen3.price = 55;
		pen3.color = "Black";
		
		Pen[] pens = {pen1, pen2, pen3};
		int min = pen1.price;
		for(int i=0; i<pens.length; i++) {
			if(pens[i].price>min) {
				System.out.println(pens[i].price+(pens[i].price*10/100));
			}
		}
		
		/*Pen[] pens = {pen1, pen2, pen3};
		String max = "";
		for(int i=0; i<pens.length; i++) {
			if(pens[i].brand.length()>max.length()) {
				max = pens[i].brand;
			}
		}
		System.out.println(max);*/
		
		/*if(pen1.price>pen2.price && pen1.price>pen3.price) {
			System.out.println(pen1.price+" is Max");
		}
		if(pen2.price>pen1.price && pen2.price>pen3.price) {
			System.out.println(pen2.price+" is Max");
		}
		else {
			System.out.println(pen3.price+" is Max");
		}*/
		}
		
		/*System.out.println(pen1.brand.substring(1,(pen1.brand.length()-1)));*/
		/*Pen[] pens = {pen1, pen2};
		for(int i=0; i<pens.length; i++) {
			System.out.println(pens[i].brand.substring(1, pens[i].brand.length()-1));
		}*/
	}


