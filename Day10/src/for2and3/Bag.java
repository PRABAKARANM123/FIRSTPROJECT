package for2and3;

public class Bag {
	public static void main(String[] args) {
		String[] bags = {"WildGraft","AmericanTourister","Skybags","Nike"};
		for(int i=bags.length-1; i>=bags.length/2; i--) {
			System.out.println(bags[i]);
		}
	}

}
