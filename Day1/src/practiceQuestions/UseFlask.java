package practiceQuestions;

public class UseFlask {
	public static void main(String[] args) {
		String[] f = args[0].split(",");
		Flask flask = new Flask();
		flask.brand= f[0].toLowerCase();
		flask.price = Integer.parseInt(f[1]);
		flask.isSteelType = Boolean.parseBoolean(f[2]);
		System.out.println("BRAND: "+flask.brand+", PRICE: "+flask.price+", STEELTYPE: "+flask.isSteelType+", LENGTH: "+flask.brand.length()+", SECOND LAST LETTER: "+flask.brand.charAt(flask.brand.length()-2));
	}

}
