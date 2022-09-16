package polymorpisam;

public class UseSportsCar {
	public static void main(String[] args) {
		SportsCar sportsCar1 = new SportsCar("BMW", 1700000, "Blue");
		SportsCar sportsCar2 = new SportsCar("Ferrary", 2000000, "Red");
		System.out.println(sportsCar1);
		System.out.println(sportsCar2.showSpeed(700));
	}

}
