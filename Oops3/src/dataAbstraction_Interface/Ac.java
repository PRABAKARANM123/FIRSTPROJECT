package dataAbstraction_Interface;

public abstract class Ac {
	abstract public void maxTemp();
	public String compressor(String brand) {
	if(brand.equals("Daikin")) {
		return "Goog compressor";
	}
	else {
		return "Average Compressor"; 
	}
	}

}
