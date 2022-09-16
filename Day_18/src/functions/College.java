package functions;

public class College {
	String name;
	String grade;
	int fees;
	int code;
	
	
	public int findMaxFeesCode(College[] b) {
		int max = 0; int c = 0;
		for(int i=0; i<b.length; i++) {
			if(b[i].fees>max) {
				max = b[i].fees;
				c = b[i].code;
			}
		}
		return(c);
	}
	public String minCollFees(College[] a) {
		int fees=a[1].fees;
		String name="";
		for(int i=0;i<a.length;i++) {
			if(a[i].fees<fees) {
				fees=a[i].fees;
				name=a[i].name;
			}
		}
		return "fees="+name;
		
	}

}
