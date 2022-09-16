package for4_loopWithCondition;

public class CheckPalintrome {
	public static void main(String[] args) {
		String word = "Malayalam";
		String reverse = "";
		for(int i=word.length()-1; i>=0; i--) {
			//System.out.println(word.charAt(i));
			reverse = reverse+word.charAt(i);
			
		}
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println(reverse+" IS A PALINDROME");
		}
		else {
			System.out.println(reverse+" IS NOT PALINDROME");
		}
	}

}
