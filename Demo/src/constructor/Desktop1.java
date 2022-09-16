package constructor;

public class Desktop1 {
	String type;
	boolean isMonitor;
	public Desktop1() {
		System.out.println("MICROSOFT DESKTOP");
	}
	public Desktop1(String type, boolean isMonitor) {
		this.type = type;
		this.isMonitor = isMonitor;
	}

}
