package lms;

public class Test1 {
	public static void main(String[]args)
	{
		String[] name1=args[0].split(",");
		String[] name2=name1[1].split("/");
		String name3=name2[1].toUpperCase();
		int count=name1.length;
		System.out.println("Name1="+name2 +"Name2="+name3 );
	}

}
