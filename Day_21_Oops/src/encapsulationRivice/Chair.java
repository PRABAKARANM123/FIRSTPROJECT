package encapsulationRivice;

public class Chair {
	private int noOfLegs;
	private String material;
	private boolean isRocking;
	
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	public void setIsRocking(boolean isRocking) {
		this.isRocking = isRocking;
	}
	public boolean getIsRocking() {
		return isRocking;
	}
	
	public String toString() {
		return noOfLegs+" "+material+" "+isRocking;
	}
	
	public Chair(int noOfLegs, String material, boolean isRocking) {
		this.noOfLegs = noOfLegs;
		this.material = material;
		this.isRocking = isRocking;
	}

}
