package conditionsInsideObject;

public class UseWatch {
	public static void main(String[] args) {
		Watch watch =new Watch();
		watch.brand = "titan";
		watch.price = 2000;
		watch.color = "bkack";
		watch.isWarranty = true;
		watch.strap = "silver";
		watch.material = "gold";
		
		Watch watch2 = new Watch();
		watch2.brand = "rolex";
		watch2.price = 200000;
		watch2.color = "Gold";
		watch2.isWarranty = true;
		watch2.strap = "lether";
		watch2.material = "iron";
		
		Watch watch3 = new Watch();
		watch3.brand = "casio";
		watch3.price = 15000;
		watch3.color = "red";
		watch3.isWarranty = false;
		watch3.strap = "silver";
		watch.material = "rubber";
		
		if(watch.price>watch2.price&&watch.price>watch3.price) {
			System.out.println(watch.brand.toUpperCase());
		}
		else if(watch2.price>watch.price&&watch2.price>watch3.price) {
			System.out.println(watch.brand.toUpperCase());
		}
			
		
		else if(watch3.price>watch.price&&watch3.price>watch2.price) {
			System.out.println(watch3.brand.toUpperCase());
		}
	}
}
		
		
		
	


