package for2and3;

public class Laptop {
	public static void main(String[] args) {
		int[] rams=new int[4];
		rams[0]=2;
		rams[1]=4;
		rams[2]=8;
		rams[3]=16;
		for(int i=rams.length-1; i>=0; i--) {
			System.out.println(rams[i]);
		}
	}

}
