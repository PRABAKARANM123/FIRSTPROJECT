package test;

public class Employee {
    String name;
	int id;
	int salary;
	String designation;
	public Employee(String name, int id, int salary, String designation) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.designation = designation;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", designation=" + designation + "]";
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
	

}
