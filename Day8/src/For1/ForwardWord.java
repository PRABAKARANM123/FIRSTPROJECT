package For1;

public class ForwardWord {
	public static void main(String[] args) {
		String word = "Onesoft";
		String forward = "";
		for(int i=0; i<=word.length()-1; i++) {
			forward = forward+word.charAt(i);
			System.out.println(forward);
		}
		System.out.println(forward);
	}

}
