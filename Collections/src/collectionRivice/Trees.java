package collectionRivice;

import java.util.ArrayList;

public class Trees {
	public static void main(String[] args) {
		ArrayList<String> t = new ArrayList<>();
		t.add("Neem");
		t.add("Almand");
		t.add("Banana");
		t.add("Palm");
		t.add("Teek");
		
		ArrayList<String> et = new ArrayList<>();
		for(int i=0; i<t.size(); i++) {
			if(i%2==0) {
				et.add(t.get(i));
			}
		}
		System.out.println(et);
		
	}

}
