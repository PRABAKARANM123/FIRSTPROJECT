package collection_2;

import java.util.HashMap;

public class Lms2 {
	public static void main(String[] args) {
		HashMap<Integer, String> c = new HashMap<>();
		c.put(786, "Hari");
		c.put(776, "Bhuvi");
		c.put(755, "Raj");
		c.put(758, "Kavi");
		
		for(String k: c.values()) {
			System.out.println(k);
		}
	}
}
