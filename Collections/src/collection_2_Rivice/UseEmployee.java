package collection_2_Rivice;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import collection_3.Employee;

public class UseEmployee {
	 public static void main(String[] args) {
			Employee e1 = new Employee(101, "Ram", 27, 500000, "manager", 5);
			Employee e2 = new Employee(102, "Prabu", 26, 60000, "Developer", 6);
			Employee e3 = new Employee(103, "Kalai", 32, 70000, "Tester", 7);
			Employee e4 = new Employee(104, "Kavi", 28, 80000, "HR", 8);
			Employee e5 = new Employee(105, "Raj", 28, 550000, "manager", 5);
			
			ArrayList<Employee> li = new ArrayList<>();
			li.add(e1);
			li.add(e2);
			li.add(e3);
			li.add(e4);
			li.add(e5);
			
			Map<Integer, Employee> hm = li.stream().filter(x->x.getDesignation().equalsIgnoreCase("manager") && x.getSalary()>60000).collect(Collectors.toMap(x->x.getId(), y->y));
			hm.forEach((x,y)-> System.out.println(x+" "+y));
	 }
}
