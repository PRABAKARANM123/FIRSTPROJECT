
public class UseEmployee {
	public static void main(String[] args) {
		String[] n = args[0].split(",");
		Employee employee = new Employee();
		employee.id = Integer.parseInt(n[0]);
		employee.name = n[1].toUpperCase();
		employee.designation = n[2].toUpperCase();
		employee.salary = Float.parseFloat(n[3]);
		employee.phone = Long.parseLong(n[4]);
		System.out.println("ID="+employee.id+", NAME="+employee.name+", DESIGNATION="+employee.designation+", SALARY="+employee.salary+", PHONE=+91"+employee.phone);
	
	}

}
