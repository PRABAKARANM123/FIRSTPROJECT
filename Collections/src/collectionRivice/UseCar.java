package collectionRivice;

import java.util.ArrayList;

public class UseCar {
	public static void main(String[] args) {
		ArrayList<Car> a = new ArrayList<>();
		//ArrayList<Car> cars = new ArrayList<>();
		a.add(new Car("Tata", 500000, "White"));
		a.add(new Car("Bmw", 1000000, "Red"));
		a.add(new Car("Hundai", 800000, "White"));
		a.add(new Car("Ferrari", 900000, "Yellow"));
		a.add(new Car("Audi", 1200000, "Orange"));
		a.add(new Car("Renalt", 1500000, "Black"));
		
		ArrayList<Car> b = new ArrayList<>();
		for(int i=0; i<a.size(); i++) {
			if(a.get(i).getBrand().length()%2==0) {
				b.add(a.get(i));
				//System.out.println(b);
			}
		}
		a.forEach(x->System.out.println(x.getBrand()));
		//System.out.println(getBrand());
		//for(Car ab:a) {
			//if(ab.getBrand().length()%2==0 ||ab.getBrand().length()%2!=0) {
				//ArrayList<Car>b=new ArrayList<>();
				//b.add(ab);
				//System.out.println(b);

			//}
		//}
	}
}
		
	


