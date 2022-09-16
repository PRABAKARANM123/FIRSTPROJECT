package practiceQuestions;

public class Static_Demo {
	public Static_Demo() {
		System.out.println("Hollo From Constractor");
	}
	{
		System.out.println("Hello From non static block");
	}
	{
		System.out.println("Hello From non static block 2");
	}
	static {                       //called block
		System.out.println("Hello From Static Block");
	}
	static {                       //called block
		System.out.println("Hello From Static Block 2");
	}
	public static void main(String[] args) {
		//Static_Demo qs = new Static_Demo();
			System.out.println("Hello From Main Methed");
			Static_Demo qs = new Static_Demo();
			Static_Demo qs2 = new Static_Demo();
	}
	public static void test() {
		System.out.println("Static Methed Test");
	}

}
