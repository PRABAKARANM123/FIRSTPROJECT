package for4_loopWithCondition;

public class CountLttersNumber {
	public static void main(String[] args) {
		String bikeNo = "TN-30-ak-3322";
		int capsCount = 0;  int smallCount = 0;  int numberCount = 0;
		int specialChar = 0;
		for(int i = 0; i<bikeNo.length(); i++) {
			if(bikeNo.charAt(i)>='a' && bikeNo.charAt(i)<='z') {
				smallCount = smallCount+1;
			}
			else if(bikeNo.charAt(i)>='A' && bikeNo.charAt(i)<='Z') {
				capsCount = capsCount+1;
			}
			else if(bikeNo.charAt(i)>='0' && bikeNo.charAt(i)<='9') {
				numberCount = numberCount+1;
			}
			else {
				specialChar = specialChar+1;
			}
		}
			System.out.println("NUMBER COUNT : "+numberCount+", SMALL LETTER COUNT : "+smallCount+", CAPITAL LETTER COUNT : "+capsCount+", SPECIAL CHARACTOR COUNT : "+specialChar);
		}
	}


