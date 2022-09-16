package Polymorphism;

public class IcIcIBank extends RBIBank {
	public int getInterest (int amount, int interest) {
		return amount+interest;
	}
	
	void display() {
		System.out.println(super.getInterest(5000, 6000));
	}
	
	public static void main(String[] args) {
		IcIcIBank b1 = new IcIcIBank();
		System.out.println(b1.getInterest(5000, 6000));
		System.out.println(b1.getInterest(5000, 6000));
		b1.display();
	}

}
