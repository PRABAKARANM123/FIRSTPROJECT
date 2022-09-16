package for4_loopWithCondition;

public class OddOrEvenArray {
	public static void main(String[] args) {
		int[] number = {33, 22, 44, 56, 78, 99, 19};
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0; i<number.length; i++) {
			if(number[i]%2==0) {
			evenCount = evenCount+1;
			System.out.println(number[i]+" IS EVEN");
			
		}
		else {
			oddCount = oddCount+1;
			System.out.println(number[i]+" IS ODD");
		}
		
	}
	System.out.println("EVEN COUNT IS : "+evenCount);
	System.out.println("ODD COUNT IS : "+oddCount);

}
}