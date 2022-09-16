package handling;

public class ChcekVoterAge {
	public static void main(String[] args) throws CheckAgeException, Exception{
		int age = 19;
		try {
			if(age>18) {
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
