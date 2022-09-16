package polymorpisam;

public class Maximum {
	public int findMaximum(int num1, int num2) {
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
	public String findMaximum(String a, String b) {
		if(a.length()>b.length()) {
			return a;
		}
		else {
			return b;
		}
	}

}
