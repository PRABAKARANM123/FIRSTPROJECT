package test;

public class Max {
	public void findMax(int a, int b) {
		if(a>b) {
			System.out.println(a+" Is Max");
		}
		else {
			System.out.println(b+" Is Max");
		}
	}
	public void findMax(float c, float d, float e) {
		if(c>d && c>e) {
			System.out.println(c+" Is Max");
		}
		else if(d>c && d>e) {
			System.out.println(d+" Is Max");
		}
		else  {
			System.out.println(e+" Is Max");
		}
	}

}
