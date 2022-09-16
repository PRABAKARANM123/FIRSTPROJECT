package dataAbstraction_Interface;

public abstract class Furniture {
	public void materialDurablity(String type) {
		if(type.equalsIgnoreCase("steel")) {
			System.out.println("Average Durablity");
		}
		else if(type.equalsIgnoreCase("Wood")) {
			System.out.println("Good Durablity");
		}
		else if(type.equalsIgnoreCase("Plastic")) {
			System.out.println("low Durablity");
		}
		else {
			System.out.println("Invalid Data");
		}
	}
	public abstract int noOfLegs(); 

}
