package Collection_1;

import java.util.ArrayList;

public class UseEmployee3 {
	public static void main(String[]args) {
	Employee emp1 = new Employee("Ram", 454, 100000, "Developer");
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
	
	//el.forEach((b)-> System.out.println(b)); 
	
	el.forEach((a)->
	{
       if(a.getSalary()>30000) {
    	   System.out.println(a.getName()+" : "+a.getSalary()+" ---Maximum Salary");
       }
       else {
    	   System.out.println(a.getName()+" : "+a.getSalary()+"----Minimum Salary");
       }
	}
	);
	
	}
}
