package for4_loopWithCondition;

public class BreakContinue {
	public static void main(String[] args) {
		int count  =0;
		for(int i=1; i<=20; i++) {
			if(i%5==0) {
				//System.out.println("Divisible : "+i);
				continue;
			}
			else {
				System.out.println(i);
				count=count+1;
			}
		}
		System.out.println("TOTAL COUNT : "+count);
	}

}
