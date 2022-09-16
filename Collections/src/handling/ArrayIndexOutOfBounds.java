package handling;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60};
		try {
			int b = a[7];
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Invalid");
		}
	}

}
