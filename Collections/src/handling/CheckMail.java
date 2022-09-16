package handling;

public class CheckMail {
	public static void main(String[] args) {
		String mail = "Praba@12345.@gmail.com";
		try {
			if(mail.contains("gmail")) {
				throw new CheckMailException("It is Gmail");
			}
			else {
				System.out.println("It is Yahoo");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Invalid");
		}
	}

}
