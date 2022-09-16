package encapsulation;

public class UseMobile {
	public static void main(String[] args) {
		Battery battery = new Battery();
		battery.setBrand("Vivo Battery");
		battery.setPrice(250);
		battery.setCapacity(4000);
		
		Mobile mobile = new Mobile();
		mobile.setBrand("Vivo");
		mobile.setPrice(20000);
		mobile.setBattery(battery);
		
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getBattery().getBrand());
	}

}
