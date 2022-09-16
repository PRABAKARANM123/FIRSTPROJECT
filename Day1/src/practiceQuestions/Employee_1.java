package practiceQuestions;

public class Employee_1 {
	int id;
	int salary;
	String ceo;


public void show() {
	System.out.println(id+" : "+salary+" : "+ceo);
}
public class UseEmployee_1 {
	public static void main(String[] args) {
	Employee_1 kavi = new Employee_1();
	kavi.id = 15;
	kavi.salary = 5000;
	kavi.ceo = "Sundhar";
	
	Employee_1 ram = new Employee_1();
	ram.id = 14;
	ram.salary = 6000;
	ram.ceo = "Sundhar";
	
	kavi.show();
	ram.show();
}
}
}