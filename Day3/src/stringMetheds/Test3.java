package stringMetheds;

public class Test3 {
	public static void main(String[]args)
	{
		String name1="Dream";
		String name2="Turkey";
		String result=name1.concat(name2);
		String letters=result.toUpperCase();
		char lastLetter=name2.charAt(name2.length()-1);
		int number=name2.length();
		int position=name2.indexOf('k');
		System.out.println(position);
		System.out.println(name1.concat(name2).toLowerCase()+"  "+name2.charAt(2));
		System.out.println("PRABA".concat("KARAN"));
		System.out.println(position);
		
		
		
	}

}

