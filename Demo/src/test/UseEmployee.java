package test;
import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ram", 454, 10000, "Developer");
		Employee emp2 = new Employee("kavi", 562, 20000, "Tester");
		Employee emp3 = new Employee("Prabu", 789, 30000, "Java Developer");
		Employee emp4 = new Employee("Ramya", 987, 40000, "Java Tester");
		Employee emp5 = new Employee("Ashoke", 456, 50000, "Manager");
		
		
		ArrayList<Employee>el = new ArrayList<>();
		el.add(emp1);
		el.add(emp2);
		el.add(emp3);
		el.add(emp4);
		el.add(emp5);
		
		ArrayList<Employee> e = new ArrayList<>();
		//for(int i=0; i<el.size(); i++) {
			e.addAll((el));
				
			//	System.out.println(e);
			//}
//			if(el.get(i).getSalary()>20000) {
//				e.add(el.get(i).getName());
//			}
	}
}
