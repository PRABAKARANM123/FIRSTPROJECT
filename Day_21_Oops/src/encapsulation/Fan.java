package encapsulation;

public class Fan {
	private String brand;
	private int price;
	private int noOfWings;
	private Coil coil;
	
	public void setBrand(String brand1) {
		brand = brand1;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price1) {
		price = price1;
	}
	public int getPrice() {
		return price;
	}
	public void setNoOfWings(int noOfWings1) {
		noOfWings = noOfWings1;
	}
	public int getNoOfWings() {
		return noOfWings;
	}
	public void setCoil(Coil coil1) {
		coil = coil1;
	}
	public Coil getCoil() {
		return coil;
	}
	
	
	public Fan(String brand1, int price1, Coil coil1) {
	    brand = brand1;
		price = price1;
		coil = coil1;
	}

	public String toString() {
		return brand+" "+price+" "+coil;
	}

}
