package polymorpisam;

public class UseComputer {
	public static void main(String[] args) {
		Cpu cpu1 = new Cpu(2000, "A1");
		
		Computer comp = new Computer("Dell", 25000,cpu1);
		System.out.println(comp.cpu.price);
	}

}
