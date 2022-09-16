package encapsulation;

public class Coil {
	private String brand;
	private int price;
	private String phaseType;
	
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
	public void setPhaseType(String phaseType1) {
		phaseType = phaseType1;
	}
	public String getPhaseType() {
		return phaseType;
	}
	
	
	public Coil(String brand1, int price1, String phaseType1) {
		brand = brand1;
		price = price1;
		phaseType = phaseType1;
	}

	public String toString() {
		return brand+" "+price+" "+phaseType;
	}
}
