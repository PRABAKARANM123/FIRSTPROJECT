package for4_loopWithCondition;

public class MaxStringCount {
	public static void main(String[] args) {
		//String max = "";
		//String min = "";
		String [] name = {"bench","c","computer","car","mobile","four",};
		String max = "";
		String mi = name[0];
		for(int i=0; i<name.length; i++) {
			if(name[i].length()>max.length()) {
				max = name[i];
			}
			else if(name[i].length()<mi.length()) {
				
				mi = name[i];
			}
		}
		System.out.println(max);
		System.out.println(mi);
	}
}



