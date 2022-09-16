package for4_loopWithCondition;

public class Plural_Count {
	public static void main(String[] ags) {
		String[] name = {"Cars","Bike","Trucks","Jeep","Cycle"};
		int count = 0;
		for(int i=0; i<name.length; i++) {
			if(name[i].toUpperCase().endsWith("S")) {
				System.out.println(name[i]);
			}
			
		}
	}

}
