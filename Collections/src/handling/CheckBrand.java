package handling;

public class CheckBrand {
	public static void main(String[] args) {
		String[] brands = {"AllenSolly", "Otto", "Ramraj", "Raymand"};
		try {
			for(int i=0; i<brands.length; i++) {
				if(brands[i].equals("Otto")) {
					throw new CheckBrandException("It is Found");
				}
				else {
					System.out.println("It is Not Found");
				}
			}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Invalid");
			}
			
		
	}

}
