package For_5_ObjectArrayUsingForLoopWithCondition;

public class UseBag {
	public static void main(String[] args) {
		Bag bag1 = new Bag();
		bag1.brand = "VIP";
		bag1.bagType = "College Bag";
		bag1.price = 2000;
		bag1.isWaterProof = true;
		
		Bag bag2 = new Bag();
		bag2.brand = "Lanovo";
		bag2.bagType = "schoolBag";
		bag2.price = 2500;
		bag2.isWaterProof = true;
		
		Bag bag3 = new Bag();
		bag3.brand = "HP";
		bag3.bagType = "TravelBag";
		bag3.isWaterProof = false;
		
		Bag[] bags = {bag1, bag2, bag3};
		for(int i=0; i<bags.length; i++) {
			if(bags[i].bagType.equalsIgnoreCase("schoolBag") && bags[i].isWaterProof == true) {
			System.out.println("Brand : "+bags[i].brand);	
			}
		}
		//System.out.println("Brand : "+bags.brand+",");
	}

}
