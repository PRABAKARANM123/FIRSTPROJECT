package dataAbstraction_Interface;

public class SportsBike implements Bike, AutoMobile {
	public int speed(int cc) {
		return cc+100;
	}
	public int speed() {
		return 180;
	}
	
	public String printBrand(String brand) {
		return "Brand Name ia : "+brand;
	}

}
