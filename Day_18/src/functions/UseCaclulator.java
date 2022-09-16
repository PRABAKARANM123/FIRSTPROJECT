package functions;

public class UseCaclulator {
	public static void main(String[]args) {
	Calculator cal = new Calculator();
	System.out.println(cal.add());
	System.out.println(cal.sub(5,2.5f));
	cal.Divide();
	cal.findModules(35, 4);

}
}