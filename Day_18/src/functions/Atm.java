package functions;

public class Atm {
	String name;
	String branch;
	int mainBalance;
	
	public void findCredit(Atm b,int depositAmount) {
		System.out.println("Main Balance = "+(b.mainBalance+depositAmount));
	}
	public void findDebit(Atm c, int withdrawnAmount) {
		System.out.println("Main Balance = "+(c.mainBalance+withdrawnAmount));
	}

}
