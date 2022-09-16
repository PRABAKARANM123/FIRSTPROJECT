package for1;

public class SumOfFactorial {
	public static void main(String[] args) {
		int num1=0;
		int num2 =0;
		for(int i=1; i<=8; i++) {
			num1 = num1+i;
			num2 = num2+num1;
		}
		System.out.println(num2);
	}

}
