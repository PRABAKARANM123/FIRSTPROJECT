package lms;

public class Student {
	public static void main(String[]args)
	{
	String[]values=args[0].split(",");
	String name=values[0];
	String standard=values[1];
	int age=Integer.parseInt(values[2]);
	int rollNumber=Integer.parseInt(values[3]);
	System.out.println("StudentDetails"+name+" "+standard+" "+age+" "+rollNumber);
	
	
	
	}

}
