package test;

public class Demo {
	public static void main(String[] args) {
	     Demo selvam = new Demo();
		System.out.println(selvam.fillForm(1, 99887744, 420));
	}
	
	
public String fillForm(int sNo, int mob, int id) {
	//System.out.println("3 Arqument methid SELVSM");
	return sNo+" "+mob+" "+id;
}
public String fillForm(String name, int mob, int id, String gmail) {
	// System.out.println("4 Arqument method SATHIS");
	return name+" "+mob+" "+id+" "+gmail;
	
}
}

