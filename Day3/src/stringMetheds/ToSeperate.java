package stringMetheds;

public class ToSeperate {
	public static void main(String[]args)
	{
		String word="Apple,Orange,PineApple";
		String[] words=word.split(",");
		int len=words.length;/* dont usue'()'
with length in Array*/
		int word1=word.length();
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(len);
		
		
	}

}
