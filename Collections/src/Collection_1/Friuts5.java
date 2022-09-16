package Collection_1;

import java.util.ArrayList;

public class Friuts5 {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		li.add("Banana");
		li.add("Grapes");
		li.add("Apple");
		li.add("Mango");
		
		li.forEach((b)-> System.out.println(b)); // *Lambda Expression
	}


}
