package Collection_1;

import java.util.ArrayList;

public class Fruits2 {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		li.add("Banana");
		li.add("Grapes");
		li.add("Apple");
		li.add("Mango");
		
		for(int i=0; i<li.size(); i++) {
			if(li.get(i).startsWith("A")) {
				System.out.println(li.get(i)+"Starts With A");
			}
			else {
				System.out.println(li.get(i)+"Not Starts With A");
			}
			
			
			if(li.get(i).equalsIgnoreCase("Apple")) {
				System.out.println(li.get(i)+"-- Is Equal");
			}
			else {
				System.out.println(li.get(i)+"-- Not Equal");
			}
			//System.out.println(li.get(i));
		}
	}

}
