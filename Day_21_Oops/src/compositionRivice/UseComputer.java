package compositionRivice;

public class UseComputer {
	public static void main(String[] args) {
		Cpu cpu1 = new Cpu();
		cpu1.ram = 512;
		cpu1.brand = "DELL CPU";
		cpu1.MotherBoard = "A1";
		
		Cpu cpu2 = new Cpu();
		cpu2.ram = 728;
		cpu2.brand = "Assus CPU";
		cpu2.MotherBoard = "A2";
		
		
		Computer comp1 = new Computer();
		comp1.brand = "DELL";
		comp1.monitorType = "LED";
		comp1.isWindows = true;
		comp1.cpu = cpu1;
		
		Computer comp2 = new Computer();
		comp2.brand = "HP";
		comp2.monitorType = "LCD";
		comp2.isWindows = true;
		comp2.cpu = cpu1; 
		
		Computer comp3 = new Computer();
		comp3.brand = "LENOVO";
		comp3.monitorType = "LCD";
		comp3.isWindows = false;
		comp3.cpu = cpu2; 
		
		
		//System.out.println(comp2.brand+" "+comp2.cpu.ram);
		//System.out.println(comp3.monitorType+" "+comp3.cpu.brand);
		Computer[] comps = {comp1, comp2, comp3};
		for(int i=0;i<comps.length; i++) {
			
			System.out.println(comps[i].brand+" : "+comps[i].cpu.brand+" : "+comps[i].cpu.ram);
			//System.out.println(comps[i].cpu.brand);
		}
	}

}
