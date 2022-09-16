package practiceQuestions;

public class Demo {
	public static void main(String[] args) {
		String[] name = {"kavi", "raj", "prAbu","prabakaran"};
		//for(int i=name.length/2; i>=0; i--) {
		//for(int i=name.length-1; i>=name.length/2; i--) {
		//for(int i=name.length/2; i<name.length; i++) {
		//for(int i=0; i<name.length; i++) {
		//for(int i=name.length-1; i>=0; i--) {
		for(int i=name.length-1; i>=0; i--) {
			
			//System.out.println(name[i].charAt(name[i].length()-1));
			//System.out.println(name[i].charAt(0));
			System.out.println(name[i].charAt(name[i].length()/2));
			
		}

	}
}
