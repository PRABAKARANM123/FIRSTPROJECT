package polymorpisam;

public class Cpu {
	int price;
	String type;
	
	public Cpu(int price, String type) {
		this.price = price;
		this.type = type;
	}
	public String toString() {
		return price+" "+type;
	}

}
