package collection_2;

import java.util.HashMap;

public class Lms4 {
	public static void main(String[] args) {
		HashMap<Integer, String> c = new HashMap<>();
		c.put(786, "Hari");
		c.put(776, "Bhuvi");
		c.put(755, "Raj");
		c.put(758, "Kavi");
		
		c.keySet().forEach(x-> System.out.println(c.get(x)));
		
//		for(Integer k: c.keySet()) {
//			System.out.println(c.get(k));
//		}
//		
	}


}
