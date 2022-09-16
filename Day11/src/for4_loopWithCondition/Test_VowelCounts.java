package for4_loopWithCondition;

public class Test_VowelCounts {
	public static void main(String[] args) {
		int vowelCount = 0;
		String name = "PrabakaAn".toLowerCase();
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				vowelCount++;
			}
		}
		System.out.println("Vowel Count Is : "+vowelCount);
	}

}
