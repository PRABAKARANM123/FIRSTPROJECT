package For_5_ObjectArrayUsingForLoopWithCondition;

public class UseStudent {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Ravi";
		student1.rollNo = 8;
		student1.std = "XI";
		
		Student student2 = new Student();
		student2.name = "Prabu";
		student2.rollNo = 15;
		student2.std = "XI";
		
		Student student3 = new Student();
		student3.name = "Raju";
		student3.rollNo = 28;
		student3.std = "XI";
		
		Student student4 = new Student();
		student4.name = "Arun";
		student4.rollNo = 10;
		student4.std = "XI";
		
		Student[] students = {student1, student2, student3, student4};
		for(Student a : students) {
			if(a.rollNo>=1 && a.rollNo<=10) {
				a.section = "Section A";	
			}
			if(a.rollNo>10 && a.rollNo<=20) {
				a.section = "Section B";
			}
			if(a.rollNo>20 && a.rollNo<30) {
				a.section = "Section C";
			}
			System.out.println("Name : "+a.name+", Section : "+a.section);
		}
	}

}
