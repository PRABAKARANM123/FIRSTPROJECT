package elseIfLadder;

public class StudentAge {
	public static void main(String[] args) {
		int ram = 20;
		int sasi = 22;
		int ravi = 25;
		if(ram<sasi&&ram<ravi) {
			System.out.println("Ram is youngest");
		}
		else if(sasi<ram&&sasi<ravi) {
			System.out.println("Sasi is youngest");
		}
		else if(ravi<ram&&ravi<sasi) {
			System.out.println("Ravi is youngest");
		}
		else {
			
		}
		
		
	}

}
