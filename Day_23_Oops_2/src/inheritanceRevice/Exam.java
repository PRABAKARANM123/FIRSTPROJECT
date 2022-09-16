package inheritanceRevice;

public class Exam {
	public String subjects(int maths, int chemistry) {
		return maths+chemistry+" Is the addition of Two Subjects";
	}
	public String subjects(String name) {
		if(name.equals("science")) {
			return name+" Is this Science subject";
		}
		else {
			return name+"  this is a Valid Subject for this Sem";
		}
	}
	
	public static void main(String[] args) {
		Exam e = new Exam();
		System.out.println(e.subjects(70,80));
		System.out.println(e.subjects("maths"));
	}

}
