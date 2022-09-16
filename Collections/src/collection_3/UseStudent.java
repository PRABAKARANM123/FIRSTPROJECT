package collection_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Ragul", 111, 98, "Mech");
		Student s2 = new Student("Kavi", 112, 90, "Mech");
		Student s3 = new Student("Kamesh", 113, 92, "Mech");
		Student s4 = new Student("Dhinesh", 114, 84, "Mech");
		Student s5 = new Student("Muthu", 115, 99, "Mech");
		
		ArrayList<Student> s = new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		
		s.stream().filter(x->x.getMark()>90).collect(Collectors.toList());
		
		//s.stream().filter(x->x.getMark()>95).collect(Collectors.toList());
		//List<Student> k = s.stream().filter((x->x.getBranch.equals("Mech").collect(Collectors.toList());
	}

}
