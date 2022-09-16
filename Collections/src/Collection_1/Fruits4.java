package Collection_1;

import java.util.ArrayList;

public class Fruits4 {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		li.add("Banana");
		li.add("Grapes");
		li.add("Apple");
		li.add("Mango");
		
		for(String str:li) {
			if(str.contains("pp")) {
				System.out.println(str+" : Contains pp");
			}
			else {
				System.out.println(str+" : Not Contains pp");
			}
			//System.out.println(str);
		}
	}


}
