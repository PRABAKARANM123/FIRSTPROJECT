package singleInheritance;

public class MountainBike extends Bike {
	int climbingSpeed;
	int weight;
	
	public MountainBike(String brand, int price, String color, int climbingSpeed, int weight) {
		super(brand, price, color);
		this.climbingSpeed = climbingSpeed;
		this.weight = weight;
		super.color = color;  //super constractor use
	}
	public String toString() {
		return super.toString()+"Climbing Speed : "+climbingSpeed+", Weight : "+weight;
	}

}
