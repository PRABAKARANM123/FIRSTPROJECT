package For1;

public class FindFibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		for(int i=1; i<=10; i++) {
			//System.out.println(num1+" "+i+" times");
		    num3 = num1+num2;
			num1=num2;/* called variable swapping*/
			//num2=num3;
			System.out.println(num1+" "+i+" times");
			num2=num3;
		}
	}

}
