package polymorpisam;

public class SportsCar extends Car {
	String color;
	public SportsCar(String brand, int price, String color) {
		super(brand, price);
			this.color = color;
		}
		public String toString() {
			return super.toString()+"Color : "+color;
		}
		public String showSpeed(int cc) {
			return "Sports Car Speed Is : "+cc+", Km";
		
	}

}
