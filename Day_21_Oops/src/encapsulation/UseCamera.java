package encapsulation;

public class UseCamera {
	public static void main(String[] args) {
		Lense lense = new Lense(110, true);
		Camera camera = new Camera("Canaon", 45000, lense);
		System.out.println(camera);
	}

}
