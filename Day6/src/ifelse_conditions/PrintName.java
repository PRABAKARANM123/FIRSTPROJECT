package ifelse_conditions;

public class PrintName {
	public static void main(String[] args) {
		String name = "OneSoft";
		if(name.length()==5) {
			System.out.println(name);
		}
		else {
			System.out.println(name.substring(1,name.length()-1));
		}
	}

	}
