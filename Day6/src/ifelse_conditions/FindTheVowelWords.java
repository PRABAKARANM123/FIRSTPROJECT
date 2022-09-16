package ifelse_conditions;

public class FindTheVowelWords {
	public static void main(String[] args) {
		String name = "MEFINHOU";/* If question small letter all letters take smle or all are Upper case*/
		if(name.contains("A")||name.contains("E")||name.contains("I")||name.contains("O")||name.contains("U")) {
			System.out.println("Vovels Contains");
			
		}
		else {
			System.out.println("Vowel Does Not Contains");
		}
	}

}
