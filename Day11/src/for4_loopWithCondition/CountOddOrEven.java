package for4_loopWithCondition;

public class CountOddOrEven {
	public static void main(String[] args) {
		int oddCount = 0;
		int evenCount = 0;
		for(int i=1; i<100;i++) {
			if(i%2==0) {
				evenCount = evenCount+1;
				System.out.println("Seres of even: "+i);
			}
			else {
				oddCount = oddCount+1;
				//System.out.println("Seres of Odd :"+i);
				
			}
		}
		System.out.println("NO of Evencount : "+evenCount);
		System.out.println("No of OddCount : "+oddCount);
	}

}
