package encapsulationRivice;

public class Marker {
	private String color;
	private int price;
	private boolean isRefillable;
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsRefillable(boolean isRefillable) {
		this.isRefillable = isRefillable;
	}
	public boolean getIsRefillable() {
		return isRefillable;
	}



}
