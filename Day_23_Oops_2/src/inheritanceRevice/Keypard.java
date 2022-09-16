package inheritanceRevice;

public class Keypard extends LandLine {
	public void text() {
	System.out.println("Texting");
	}
	
	public static void main(String[] args) {
		Keypard k = new Keypard();
		k.call();
		k.text();
	}

}
