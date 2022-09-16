package handling;

public class OverFlow {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	
	public static void main(String[] args) {
		OverFlow of = new OverFlow();
		of.findA(); 
	}

}
