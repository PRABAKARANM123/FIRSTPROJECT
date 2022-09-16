package elseIfLadder;

public class AcTemperature {
	public static void main(String[] args) {
		int temp = 22;
		if(temp>16&&temp<=20) {
			System.out.println("Very coid wether");
		}
		else if(temp>20&&temp<=25) {
			System.out.println("Cold Weather");
			
		}
		else if(temp>25&&temp<=30) {
			System.out.println("normal Weather");
			
			
		}
		else {
			System.out.println("Check your data");
		}
	}

}
