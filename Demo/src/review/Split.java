package review;

public class Split {
	public static void main(String[] args) {
		String name = "My name is prabakaran";
		String[] names = name.split(" ");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
