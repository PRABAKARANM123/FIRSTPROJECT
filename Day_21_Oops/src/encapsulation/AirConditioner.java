package encapsulation;

public class AirConditioner {
	private String type;
	private String brand;
	private int price;
	private Compressor compressor;
	
	public void setType(String type1) {
		type = type1;
	}
	public String getType() {
		return type;
	}
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
	public void setCompressor(Compressor compressor1) {
		compressor = compressor1;
	}
	public Compressor getCompressor() {
		return compressor;
	}

}
