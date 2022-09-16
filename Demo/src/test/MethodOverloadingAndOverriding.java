package test;

public class MethodOverloadingAndOverriding {
	public int findMax(int a, int b) {
		if(a>b) {
			//System.out.println(a+" Is Max");
			return a;
		}
		else {
			//System.out.println(b+" Is Max");
			return b;
		}
	}
	public String findMax(String name1, String name2, String name3) {
		if(name1.length()>name2.length() && name1.length()>name3.length()) {
			//System.out.println(name1.length()+" Is Max");
			return name1;
		}
		else if (name2.length()>name1.length() && name2.length()>name3.length()) {
			//System.out.println(name2.length()+" Is Max");
			return name2;
		}
		else {
			return name3;
		}
	
	
	}

}
