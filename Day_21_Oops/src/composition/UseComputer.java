package composition;

public class UseComputer {
	public static void main(String[] args) {
		Cpu cpu = new Cpu();
		cpu.brand = "Dell";
		cpu.price = 5000;
		cpu.rom = 2;
		
		Computer computer = new Computer();
		computer.brand = "Del Lap";
		computer.price = 12000;
		computer.color = "Black";
		computer.cpu = cpu;
		
		System.out.println(computer.cpu.brand);
		System.out.println(computer.cpu.price);
		System.out.println(computer.brand);
		
	}

}
