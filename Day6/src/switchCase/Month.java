package switchCase;

public class Month {
	public static void main(String[] arge) {
		String month1 = "March";
		/*int month = 3;
		switch(month) {
		case 1:System.out.println("JANARY");break;
		case 2:System.out.println("FEBRAY");break;
		case 3:System.out.println("MARCH");break;
		case 4:System.out.println("APRIL");break;
		case 5:System.out.println("MAY");break;
		case 6:System.out.println("JUNE");break;
		case 7:System.out.println("JULY");break;
		case 8:System.out.println("AUGUST");break;
		case 9:System.out.println("SEPTEMER");break;
		case 10:System.out.println("OCTOBER");break;
		case 11:System.out.println("NOVEMBER");break;
		case 12:System.out.println("DECEMBER");break;
		default:System.out.println("INVALID DATA");
		}*/
		
		switch (month1) {
		case "January":System.out.println(1); break;
		case "Febrary":System.out.println(2);break;
		case "March":System.out.println(3);break;
		case "April":System.out.println(4);break;
		case "May":System.out.println(5);break;
	    default: System.out.println("Invalid Data");
		}
	}

}
