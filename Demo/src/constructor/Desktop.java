package constructor;

public class Desktop {
	String type;
	boolean isMonitor;
	public Desktop() {
		System.out.println("MICROSOFT DESKTOP");
	}
	public Desktop(String type, boolean isMonitor) {
		this.type = type;
		this.isMonitor = isMonitor;
	}
	
	public static void main(String[] args) {
		//Desktop desktop1 = new Desktop();
		Desktop desktop2 = new Desktop("OLD TYPE", true);
		System.out.println(desktop2.type+" : "+desktop2.isMonitor);
	}

}
