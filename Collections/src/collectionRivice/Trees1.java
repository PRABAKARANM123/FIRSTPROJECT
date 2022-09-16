package collectionRivice;

import java.util.ArrayList;

public class Trees1 {
	public static void main(String[] args) {
		ArrayList<String> t = new ArrayList<>();
		t.add("Neem");
		t.add("Almand");
		t.add("Banana");
		t.add("Palm");
		t.add("Teek");
		
		for(String k:t) {
			if(k.length()%2==0) {
				System.out.println(k);
			}
		}
	}
}
