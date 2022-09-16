
public class UseDoor {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		Door door = new Door();
		door.color = a[0];
		door.materialType = a[1];
		door.isSmartLockType = Boolean.parseBoolean(a[2]);
		String b = door.color.concat(door.materialType);
		System.out.println("COLOR= "+door.color.toUpperCase()+", MATERIAL TYPE= "+door.materialType.toUpperCase()+", SMARTLOCK TYPE= "+door.isSmartLockType+", TOTAL LENGTH= "+b.length());
		
		
		
	}

}