package elseIfLadder;

public class GreetingTime {
	public static void main(String[] args) {
		int time = 19;
		if(time>=6&&time<=11) {
			System.out.println("GOOD MORNING");
		}
		else if(time>=12&&time<=17) {
			System.out.println("GOOD AFTERNOON");
			
		}
		else if (time>=18&&time<=20) { 
			System.out.println("GOOD EVNING");
		}
		else if(time>=21&&time<=24) {
		
			System.out.println("GOOD NIGHT");
		}
		else {
			System.out.println("CHECK DATA");
		}
		 	
}
}
		
		
			
		

	
