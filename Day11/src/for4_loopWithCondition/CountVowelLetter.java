package for4_loopWithCondition;

public class CountVowelLetter {
	public static void main(String[] args) {
		String name = "onesofttechnoligies";
		int vowelCount = 0; int consonent = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
				vowelCount = vowelCount+1;
				System.out.println(name.charAt(i));
				
			}
			else {
				consonent = consonent+1;
			}
		}
		System.out.println("No Of Vowel Letter Is : "+vowelCount);
		System.out.println("No Of Consonent Is : "+consonent);
	}

}
