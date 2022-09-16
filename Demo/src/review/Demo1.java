package review;

public class Demo1 {
	public static void main(String[] args) {
		String[] names = {"Ram", "Kabilan", "Prabu", "ponni", "prabakaran"};
		for(int i=0; i<names.length; i++) {
			if(names[i].contains("a")) {
				System.out.println(names[i]);
			}
			
		}
	}

}
