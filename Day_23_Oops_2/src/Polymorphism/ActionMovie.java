package Polymorphism;

public class ActionMovie {
	public String getFightSequance(int fight) {
		if(fight<=3) {
			return "It is normal Action movie";
		}
		else if(fight==4) {
			return "Good Action Movie";
		}
		else if(fight>4) {
			return "Full Backed Action Movie";}
//		else {
//		    return "Invalid Data";
//		}
		// if not write 'else' part, 'return' key word is needed for end of method block(getFightSequance) 
		return "invalid Data";
	}
	
	public static void main(String[] args) {
		ActionMovie m1 = new ActionMovie();
		System.out.println(m1.getFightSequance(5));
	}

}
