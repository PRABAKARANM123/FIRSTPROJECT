package encapsulation;

public class UseFan {
	public static void main(String[] args) {
		Coil coil = new Coil("Vnuus Coil", 800, "Single");
		Fan fan = new Fan("Venus", 1500, coil);
		System.out.println(fan);
	}
	
	}


