package review;

public class PrimeOrNot {
	public static void main(String[] args) {
		int num = 5;
		boolean prime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				prime = false;
			}
		}
		if(prime==true) {
			System.out.println("It is Prime");
		}
		else {
			System.out.println("It is not Prime");
		}
	
	}

}
