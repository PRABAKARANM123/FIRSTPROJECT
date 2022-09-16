package handling;

public class StringOutOfBounds {
	public static void main(String[] args) {
		
		try {
			String a = "Prabakaran";
			char b = a.charAt(12);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Invalid");
		}
	}


}
