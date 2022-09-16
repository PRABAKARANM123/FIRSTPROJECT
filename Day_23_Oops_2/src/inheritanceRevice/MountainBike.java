package inheritanceRevice;

public class MountainBike extends Bike {
	int climbingSpeed;
	int weight;
	int maxSpeed(int num) {
		return num;
	}
	
	void show() {// the method 'show()' represent childclass but inside code represent parant class
		System.out.println(super.brand);
		System.out.println(super.price);
		System.out.println(super.model);
		System.out.println(super.findPrice(25));
	}
	public static void main(String[] args) {
		//Bike v =new MountainBike();
		//MountainBike m = new Bike();
		MountainBike b1 = new MountainBike();
		b1.brand = "Yamaha";
		b1.price = 100000;
		b1.model = "FZ";
		b1.climbingSpeed = 180;
		b1.weight = 85;
	    System.out.println(b1.findPrice(15));
		b1.show();
		//System.out.println(b1.maxSpeed(120));
		//System.out.println(b1.weight);
	}

}
