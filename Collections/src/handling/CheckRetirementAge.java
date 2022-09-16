package handling;

public class CheckRetirementAge {
	public static void main(String[] args) {
		int age = 70;
		try {
			if(age>60) {
				throw new CheckAgeException("Eligible");
			}
			else {
				System.out.println("Not Eligible");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Invalid");
		}
	}

}
