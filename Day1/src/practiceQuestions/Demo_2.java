package practiceQuestions;

public class Demo_2 {
	public static void main(String[] args) {
		String name = "Madam";
		String reverse = "";
		for(int i =name.length()-1; i>=0; i--) {
			reverse = reverse+name.charAt(i);
			
		}
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

}
