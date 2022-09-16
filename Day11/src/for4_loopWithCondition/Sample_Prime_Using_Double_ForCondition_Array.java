package for4_loopWithCondition;

public class Sample_Prime_Using_Double_ForCondition_Array {
	public static void main(String[] args) {
		int[] nums = {3,7,9,77,90};
		boolean isPrime = true;
		for(int i=0; i<nums.length; i++) {
			//boolean isPrime = true;
			int num = nums[i];
			for(int j=2; j<num; j++) {
				if(num%j==0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(nums[i]+" Is Prime");
				
			}
			else {
				System.out.println(nums[i]+" Not Prime");
			}
		}
		
	}
	
}