package collection_2_Rivice;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private int age;
	private int salary;
	private String designation;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	private int experience;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
	return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public int getAge() {
		return age;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesicnation() {
		return designation;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getExperience() {
		return experience;
	}
	
	
	
	public Employee(int id, String name, String gender, int age, int salary, String designation, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
		this.experience = experience;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
				+ ", designation=" + designation + ", experience=" + experience + "]";
	}

}
