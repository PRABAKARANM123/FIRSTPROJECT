package encapsulation;

public class Compressor {
	private String brand;
	private int price;
	private int capacity;
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
	public void setCapacity(int capacity1) {
		capacity = capacity1;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setPhaseType(String phaseType1) {
		phaseType = phaseType1;
	}
	

}
