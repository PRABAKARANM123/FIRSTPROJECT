package for4_loopWithCondition;

public class PrintOnly2And2Divisible {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0&&i%2==0) {
				System.out.println(i);
				count = count+1;
				
			}
			
		}
		System.out.println("NO Of Count Is : "+count);
	}

}
