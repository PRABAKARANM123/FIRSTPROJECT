package for4_loopWithCondition;

public class BreakTheLoop {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%5==0) {
				System.out.println(i);
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
