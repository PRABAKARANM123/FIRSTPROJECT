package method;

public class Addition {
	public static void main(String[] args) {
		Addition addNumber = new Addition();
		
		System.out.println(addNumber.add(5, 7));
	}
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}

}
