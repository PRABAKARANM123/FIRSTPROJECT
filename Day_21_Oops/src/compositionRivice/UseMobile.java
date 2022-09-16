package compositionRivice;

public class UseMobile {
	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.brand = "Snapgragon";
		p1.price = 5000;
		p1.aScore = 24898;
		
		Mobile mob = new Mobile();
		mob.brand = "Redmi";
		mob.color = "Black";
		mob.price = 15000;
		mob.processor = p1;
		
		System.out.println(mob.brand+"  "+mob.color+"  "+mob.price+"  "+mob.processor.brand);
	}

}
