package singleInheritance;

public class UseMountainBike {
	public static void main(String[] args) {
		MountainBike mbike = new MountainBike("BMW", 1500000, "White", 50, 150); 
	
	System.out.println(mbike);
	System.out.println(mbike.findNetPrice(18));

}
}