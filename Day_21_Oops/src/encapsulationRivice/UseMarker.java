package encapsulationRivice;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1 = new Marker();
		m1.setColor("Black");
		m1.setPrice(50);
		m1.setIsRefillable(false);
		System.out.println(m1.getColor()+" "+m1.getPrice()+" "+m1.getIsRefillable());
	}

}
