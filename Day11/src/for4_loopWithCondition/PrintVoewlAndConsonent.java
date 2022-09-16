package for4_loopWithCondition;

public class PrintVoewlAndConsonent {
	public static void main(String[] args) {
		String name = "onesofttechnologies";
		String vowel = "";    int vowelCount = 0;
		String consonent = "";    int conCount =0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				vowel = vowel+name.charAt(i);
				vowelCount = vowelCount+1;
				
			}
			else {
				consonent = consonent+name.charAt(i);
				conCount = conCount+1;
			}
		}
		System.out.println("VOWEL : "+vowel);
		System.out.println("V COUNT IS : "+vowelCount);
		System.out.println("CONSONET : "+consonent);
		System.out.println("C COUNT IS : "+conCount);
	}

}
