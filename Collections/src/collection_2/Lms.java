package collection_2;

import java.util.HashMap;

public class Lms {
	public static void main(String[] args) {
		HashMap<Integer, String> c = new HashMap<>();
		c.put(786, "Hari");
		c.put(776, "Bhuvi");
		c.put(755, "Raj");
		c.put(758, "Kavi");
		
		System.out.println(c.get(776));
		System.out.println(c.keySet());
		System.out.println(c.values());
		System.out.println(c.remove(755));
		
		for(Integer k: c.keySet()) {
			System.out.println(k);
		}
		
	}

}
