package functions;

public class UseAtm {
	public static void main(String[] args) {
		Atm a = new Atm();
		a.name = "TMB";
		a.branch = "Salem";
		a.mainBalance = 6000;
		
		a.findCredit(a, 2000);
		a.findDebit(a,3000);
		
		
	}

}
