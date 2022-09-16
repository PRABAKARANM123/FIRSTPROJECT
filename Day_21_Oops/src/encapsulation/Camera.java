package encapsulation;

public class Camera {
	private String brand;
	private int price;
	private Lense lense;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setLense(Lense lense) {
		this.lense = lense;
	}
	public Lense getLense() {
		return lense;
	}
	
	public Camera(String brand, int price, Lense lense) {
		this.brand = brand;
		this.price = price;
		this.lense = lense;
	}
	
	public String toString() {
		return brand+" "+price+" "+lense;
	}

}
