package functions;

public class OddOrEven {
	public void findOddOrEven(int[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" Is Even");
			}
			else {
				System.out.println(a[i]+" Is Odd");
			}
		}
	}
	

}
