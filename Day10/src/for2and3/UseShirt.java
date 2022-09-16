package for2and3;

public class UseShirt {
	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();
		shirt1.brand = "Basis";
		shirt1.price = 1700;
		shirt1.colour = "Blue";
		shirt1.isChecked =true;
		shirt1.discountAmount = 1000;
		shirt1.netPrice = shirt1.price-shirt1.discountAmount;
		
		Shirt shirt2 = new Shirt();
		shirt2.brand = "Otto";
		shirt2.price = 1500;
		shirt2.colour = "Red";
		shirt2.isChecked = true;
		shirt2.discountAmount = 150;
		shirt2.netPrice = shirt2.price-shirt2.discountAmount;
		
		
		Shirt shirt3 = new Shirt();
		shirt3.brand = "Arrow";//.toUpperCase();
		shirt3.price = 1800;
		shirt3.colour = "Yellow";
		shirt3.isChecked = false;
		shirt3.discountAmount = 100;
		shirt3.netPrice = shirt3.price-shirt3.discountAmount;
		
		Shirt[] shirts = new Shirt[3];
		shirts[0] = shirt1;
		shirts[1] = shirt2;
		shirts[2] = shirt3;
		
//		int count = 0;
//		for(int i=0; i<shirts.length; i++) {
//			if(shirts[i].isChecked==true) {
//				count++;
//			}
//			//System.out.println(shirts[i].brand.charAt(0)+"  "+shirts[i].brand.charAt(shirts[i].brand.length()-1));
//		}
//		System.out.println(count);
		
		
		
//		for(int i=0; i<shirts.length; i++) {
//			if(shirts[i].brand.toUpperCase().equals("ARROW")) {
//				System.out.println(shirts[i].price);
//			}
//		}
		
		int min = shirts[0].netPrice;
		for(int i=0; i<shirts.length; i++) {
			if(shirts[i].netPrice<min) {
				min = shirts[i].netPrice;
				System.out.println(shirts[i].brand+", "+shirts[i].netPrice);
			}
		}
		//System.out.println(min);
		}
	

}
