package Polymorphism;

public class Vikram {
	public String movie(String name) {
		if(name.equalsIgnoreCase(name));
		return name+" Is Titile";
	}
	
	public String movie(int rating) {
		if(rating>4) {
			return rating+" Rating Good Movie";
		}
		else if(rating<=3 && rating>=2) {
			return rating+" Rating Ordinary Movie";
		}
		else {
			return rating+ " Not Good";
		}
	}
	
	public static void main(String[] args) {
		Vikram m = new Vikram();
		System.out.println(m.movie("vikram"));
		System.out.println(m.movie(5));
	}

}
