package for4_loopWithCondition;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean prime = true;
		int num = 59;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				prime = false;
				}
		}
		if(prime==true) {
			System.out.println(num+" IS  PRIME NUMBER");
			}
		else {
			System.out.println(num+" IS NON PRIME NUMBER");
		}
	}

}
