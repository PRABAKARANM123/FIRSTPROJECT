package for4_loopWithCondition;

public class StringMaxmimamMinimam {
	public static void main(String[] args) {
		String[] courses = {"c++","c","Java","Python"};
		String largestWord = "";
		for(int i=0; i<courses.length; i++) {
			if(courses[i].length()>largestWord.length()) {
				largestWord = courses[i];
				
			}
			//System.out.println(courses[i]);
		}
		System.out.println(largestWord);
	}
}
