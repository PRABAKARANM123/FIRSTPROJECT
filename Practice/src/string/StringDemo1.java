package string;

public class StringDemo1 {
	public static void main(String[] args) {
		StringDemo1 sd = new StringDemo1();
		String[] names = {"naresh", "raju", "muthu"};
		sd.joinWords(names);
	}

	private void joinWords(String[] names) {
		String sentence = "";
		StringBuffer sb = new StringBuffer("");
		
		for(String name:names)
		{
			sb.append(name);
			System.out.println("StringBuffer Hashcode" + sb.hashCode());
			sentence = sentence+name;
			System.out.println("String HashCode" + sentence.hashCode());
		}
		System.out.println(sentence+" From String");
		System.out.println(sb+" From StringBuffer");
	}

}


