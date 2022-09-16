
public class UseEraser {
	public static void main(String[]args) {
		String[] e = args[0].split(",");
		Eraser eraser = new Eraser();
		eraser.brand = e[0];
		eraser.price = Integer.parseInt(e[1]);
		eraser.isQuality = Boolean.parseBoolean(e[2]);
		//System.out.println("Brant - "+eraser.brand.toupperCase());
		
	}

}
