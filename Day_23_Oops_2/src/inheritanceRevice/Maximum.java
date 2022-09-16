package inheritanceRevice;

public class Maximum {
	public int findMaximum(int num1 , int num2) {
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	public int findMaximum(int num1, int num2, int num3) {
		if(num1>num2 && num1>num3) {
			return num1;
		}
		else if(num2>num1 && num2>num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
	
	public String findMaximum(String name1, String name2) {
		if(name1.length()>name1.length()) {
			return name1;
		}
		else {
			return name2;
		}
	}
	
	public static void main(String[] args) {
		Maximum max = new Maximum();
		System.out.println(max.findMaximum(10, 20));
		System.out.println(max.findMaximum(30,40,10));
		System.out.println(max.findMaximum("Ram", "Prabu"));
	}

}
