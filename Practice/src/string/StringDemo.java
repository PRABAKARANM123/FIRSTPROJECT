package string;

public class StringDemo {
	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		String[] names = {"naresh", "raju", "muthu"};
		sd.joinWords(names);
	}

	private void joinWords(String[] names) {
		String sentence = "";
		
		for(String name:names)
		{
			sentence = sentence+name;
		}
		System.out.println(sentence);
	}

}
