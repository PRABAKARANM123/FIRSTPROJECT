package collection_3;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1 = new Ac("Tata", 10000, "A1");
		Ac ac2 = new Ac("Voltas", 11000, "V2");
		Ac ac3 = new Ac("Croma", 12000, "C3");
		Ac ac4 = new Ac("Venus", 15000, "VV1");
		
		HashMap<Integer,Ac> l = new HashMap();
		l.put(1, ac1);
		l.put(2, ac2);
		l.put(3, ac3);
		l.put(4, ac4);
		
		List<Integer> k = l.keySet().stream().collect(Collectors.toList());
		k.forEach(x->System.out.println(x));
		
		List<Ac> a = l.values().stream().filter(b->b.getPrice()>11000).collect(Collectors.toList());
		a.forEach(y->System.out.println(y));
	}

}
