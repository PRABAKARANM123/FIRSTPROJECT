package For1;

public class FindFactorial {
	public static void main(String[] rgs) {
		int sum = 0;
		int fact = 1;
		//int number = 5;
		for(int i=1; i<=5; i++) {
			fact = fact*i;
			sum = sum+fact;
			System.out.println("Factorial Of "+i+" is "+fact);
			
		}
		//System.out.println("Factorial Of "+number+" is "+fact);
		System.out.println("Sum Of All Fctorial : "+sum);
	}

}
