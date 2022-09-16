package encapsulation;

public class UseAirConditioner {
	public static void main(String[] args) {
		Compressor compressor = new Compressor();
		compressor.setBrand("Tata Com");
		compressor.setPrice(10000);
		compressor.setCapacity(5000);
		compressor.setPhaseType("3 Phase");
		
		AirConditioner ac = new AirConditioner();
		ac.setType("InDoor");
		ac.setBrand("Tata");
		ac.setPrice(40000);
		ac.setCompressor(compressor);
		
		System.out.println(ac.getCompressor().getBrand());
		System.out.println(ac.getPrice());
	}

}
