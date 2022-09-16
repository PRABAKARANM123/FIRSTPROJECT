package functions;

public class PrimeNumber {
	public void findPrimeNumber (int num) {
		boolean prime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				prime = false;
			}
		}
		if(prime==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

}
