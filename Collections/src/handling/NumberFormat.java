package handling;

public class NumberFormat {
	public static void main(String[] args) {
		String a = "Prabakaran";
		try {
			int b = Integer.parseInt(a);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Invalid");
		}
	}

}
