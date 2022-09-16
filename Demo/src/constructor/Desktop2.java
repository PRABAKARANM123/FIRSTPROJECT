package constructor;

public class Desktop2 {
	String type;
	boolean isMonitor;
	public Desktop2() {
		System.out.println("MICROSOFT DESKTOP");
	}
	public Desktop2(String type, boolean isMonitor) {
		this.type = type;
		this.isMonitor = isMonitor;
		System.out.println(type+" :"+isMonitor);
	}

	

}
