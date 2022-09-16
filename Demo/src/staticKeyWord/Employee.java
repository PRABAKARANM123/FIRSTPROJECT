package staticKeyWord;
public class Employee {
	int id;
	int salary;
	static String ceo;


public void show() {
	System.out.println(id+" : "+salary+" : "+ceo);
}
public class UseEmployee_1 {
	public static void main(String[] args) {
	Employee kavi = new Employee();
	kavi.id = 15;
	kavi.salary = 5000;
	kavi.ceo = "Sundhar";
	
	Employee ram = new Employee();
	ram.id = 14;
	ram.salary = 6000;
	//ram.ceo = "Sundhar";
	
	ram.ceo = "Pichai";
	
	kavi.show();
	ram.show();

}
}
}
