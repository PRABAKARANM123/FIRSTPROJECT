package encapsulation;

public class Lense {
	private int focalLength;
	private boolean isMadeInIndia;
	
	public void setFocalLength(int focalLength) {
		this.focalLength = focalLength;
	}
	public int getFocalLength() {
		return focalLength;
	}
	public void setIsMadeInIndia(boolean isMadeInIndia) {
		this.isMadeInIndia = isMadeInIndia;
	}
	
	
	public Lense(int focalLength, boolean isMadeInIndia) {
		this.focalLength = focalLength;
		this.isMadeInIndia = isMadeInIndia;

	}
	
	public String toString() {
		return focalLength+" "+isMadeInIndia;
		
	}

}
