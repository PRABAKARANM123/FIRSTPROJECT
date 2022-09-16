package Collection_1;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String designation;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesignation() {
		return designation;
	}
	
	public Employee(String name,int id, int salary, String designation) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	
	public String toString() {
		return name+" "+id+" "+salary+" "+designation;
	}
	

}
