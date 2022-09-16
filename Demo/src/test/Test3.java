package test;

//import functions.Car;

public class Test3 {
	String brand;
	int price;
	String color;
	int taxAmount;
	int discountAmount;
	
	
	public void findNetPrice1(Test3[] d) {
		int num = 0; String name1 = "";
		for(int i=0; i<d.length; i++) {
			if(d[i].price>num) {
				num = d[i].price;
				name1 = d[i].brand;
			}
			//System.out.println("Net Price 1 : "+(d[i].price+d[i].taxAmount));
		}
		System.out.println(name1);
		
	}
	public void findNetPrice2(Test3[] c) {
		for(int i=0; i<c.length; i++) {
			System.out.println("Net Price 2 : "+(c[i].price-c[i].discountAmount));
		}
	}
	public void findMaxString(Test3[] s) {
		String max = "";
		for(int i=0; i<s.length; i++) {
			if(s[i].brand.length()>max.length()) {
			max = s[i].brand;
			}
		}
		System.out.println("Max String Length : "+max);
	}
	
	public void findMinString(Test3[] m) {
		String min = m[0].brand;
		for(int i=0; i<m.length; i++) {
			if(m[i].brand.length()<min.length()) {
				min = m[i].brand;
			}
		}
		System.out.println("Min String Length : "+min);
	}
	
	
	public static void main(String[] args) {
		Test3 test = new Test3();
		test.brand = "TATA";
		test.price = 500000;
		test.color = "Black";
		test.taxAmount = 2000;
		
		Test3 car2 = new Test3();
		car2.brand = "HUNDAI";
		car2.price = 600000;
		car2.color = "Black";
		car2.taxAmount = 2500;
		
		Test3 car3 = new Test3();
		car3.brand = "BMW";
		car3.price = 2000000;
		car3.color = "Black";
		car3.taxAmount = 5000;
		
		Test3[] cars = {test, car2, car3};
		test.findNetPrice1(cars);
		//car2.findNetPrice2(cars);
		//car2.findMaxString(cars);
		//test.findMinString(cars);
		
	}
}