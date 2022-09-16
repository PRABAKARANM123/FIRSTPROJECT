package lms;

public class Test2 {
	public static void main(String[]args)
	{
		String[] name1 = args[0].split(",");
		String[] name2 = name1[1].split("/");
		String name3 = name2[0].toUpperCase();
		System.out.println(name2);
		
		
	}

}
