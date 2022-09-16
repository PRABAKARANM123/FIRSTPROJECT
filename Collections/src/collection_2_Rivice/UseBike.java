package collection_2_Rivice;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike("Yamaha", 200000, "TN07H0489", "Red");
		Bike b2 = new Bike("Hero", 100000, "TN08H3489", "Black");
		Bike b3 = new Bike("Honda", 300000, "TN01H5479", "White");
		Bike b4 = new Bike("Bmw", 600000, "TN20H5689", "Yellow");
		
		HashMap<String, Bike> b = new HashMap<>();
		b.put(b1.getNoPlate(), b1);
		b.put(b2.getNoPlate(), b2);
		b.put(b3.getNoPlate(), b3);
		b.put(b4.getNoPlate(), b4);
		
		Iterator<String> bikes = b.keySet().iterator();
		while(bikes.hasNext()) {
			//String k = bikes.next();
			if(b.get(bikes.next()).getPrice()>250000) {
				bikes.remove();
			}
		}
		b.forEach((x,y)->System.out.println(y));
		
//		Iterator<Bike> bikes = b.values().iterator();
//		while(bikes.hasNext()) {
//			if(bikes.next().getPrice()>250000) {
//				bikes.remove();
//			}
//		}
//		System.out.println(b);
	}

}
