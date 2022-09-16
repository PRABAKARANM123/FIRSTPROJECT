package review;

public class Demo {
	public static void main(String[] args) {
		String mail = "Prabakaran123@gmail.com";
		int stringUpCount = 0;
		int stringLoCount = 0;
		int specialCharCount = 0;
		int numCount = 0;
		for(int i=0; i<mail.length(); i++) {
			if(mail.charAt(i)>='A' && mail.charAt(i)<='Z') {
				stringUpCount++;
			}
			else if(mail.charAt(i)>='a' && mail.charAt(i)<='z') {
				stringLoCount++;
		    }
			else if(mail.charAt(i)>='0' && mail.charAt(i)<='9') {
				numCount++;
			}
			else {
				specialCharCount++;
			}
		}
		System.out.println(stringUpCount);
		System.out.println(stringLoCount);
		System.out.println(numCount);
		System.out.println(specialCharCount);
	}

}
