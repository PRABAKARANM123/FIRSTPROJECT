package collection_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee6 {
	 public static void main(String[] args) {
			Employee e1 = new Employee(101, "Ram", 27, 50000, "manager", 5);
			Employee e2 = new Employee(102, "Prabu", 26, 60000, "Developer", 6);
			Employee e3 = new Employee(103, "Kalai", 32, 70000, "Tester", 7);
			Employee e4 = new Employee(104, "Kavi", 28, 80000, "HR", 8);
			Employee e5 = new Employee(105, "Raj", 28, 55000, "manager", 5);
			
			ArrayList<Employee> li = new ArrayList<>();
			li.add(e1);
			li.add(e2);
			li.add(e3);
			li.add(e4);
			li.add(e5);
			
//			List<String> l = li.stream().filter(x-> x.getSalary()>55000).map(y->y.getName()).collect(Collectors.toList());
//			l.forEach(a->System.out.println(a));
			
			li.stream().filter(x-> x.getSalary()>55000).map(y-> y.getName()).forEach(a->System.out.println(a));
	 }
}
