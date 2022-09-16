package ifelse_conditions;

public class Fruit {
	public static void main(String[] args) {
		String fruitName = "apple";
		String fruitName2 = "AppLe";
		if(fruitName.equalsIgnoreCase(fruitName2)) {
			System.out.println("EQUAL");
			System.out.println(fruitName.toUpperCase());
		}
		else {
			System.out.println("NOT EQUAL");
		}
		
	}

}
