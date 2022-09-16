package Collection_1;

import java.util.ArrayList;
import java.util.List;

public class ObjectArray {
	public static void main(String[] args) {
		List<Object> obj = new ArrayList<>();
		
		obj.add(10);
		obj.add(20.10);
		obj.add("Prabu");
		obj.add('C');
		obj.add(true);
		
		System.out.println(obj);
		System.out.println("--------------------------");
		
		obj.add(4, 20);
		System.out.println(obj);
		System.out.println("--------------------------");
		
		System.out.println(obj.get(2));
		System.out.println("--------------------------");
		
		boolean contains = obj.contains("Prabu");
		System.out.println(contains);
		System.out.println("--------------------------");
		
		System.out.println(obj.get(3));
		System.out.println("--------------------------");
		
		System.out.println(obj.indexOf("Prabu"));
		System.out.println("--------------------------");
		
		obj.remove(1);
		System.out.println(obj);
		System.out.println("--------------------------");
		
		obj.set(1, "Kavi"); //Pass index and Replace a particular value
		System.out.println(obj);
		System.out.println("--------------------------");
		
		System.out.println(obj.size());
		System.out.println("--------------------------");
		
		obj.clear();
		System.out.println(obj);
		System.out.println("--------------------------s");
	}
	

}
