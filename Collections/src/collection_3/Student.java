package collection_3;

public class Student {
	String name;
	int id;
	int mark;
	String branch;
	
	public Student(String name, int id, int mark, String branch) {
		this.name = name;
		this.id = id;
		this.mark = mark;
		this.branch = branch;
	}
	
	public String toString() {
		return name+" "+id+" "+mark+" "+branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
