package functions;

public class MaxNumber {
	public int findMaxNumber(int[] a) {
		int max = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}

}
