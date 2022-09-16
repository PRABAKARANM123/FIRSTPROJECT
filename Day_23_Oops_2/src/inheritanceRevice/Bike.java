package inheritanceRevice;

public class Bike {
	String brand;
	int price;
	String model;
	
	int findPrice(int taxPercentage) {
		int netPrice = price+taxPercentage;
		return netPrice;
	}

}
