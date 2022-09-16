package Collection_1;

import java.util.ArrayList;

public class Fruits6 {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		li.add("Banana");
		li.add("Grapes");
		li.add("Apple");
		li.add("Mango");
		
		li.forEach((b)->
				{
			if(b.length()>5) {
				System.out.println(b+" Having more Length");
			}
			else {
				System.out.println(b+" Length is below 5");
			}
				}
		);
	}

}
