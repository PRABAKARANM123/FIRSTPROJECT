package practiceQuestions;

public class Test_3_ForLoop {
	public static void main(String[] args) {
		int num = 6;
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.println(i+" "+j);
//			}
//		}
//		for(int i=1; i<=num; i++) {
//			for(int j=num; j>=i; j--) {
//				System.out.print("1");
//			}
//			System.out.println(); 
//		}
	for(int i=1; i<=num; i++) {
		for(int j=1; j<=i; j++) {
			System.out.println("*");
		}
		System.out.println();
	}
		
	}
}
