package functions;

public class UseCollege {
	public static void main(String[] args) {
		College college1 = new College();
		college1.name = "CIT";
		college1.grade = "B";
		college1.fees = 50000;
		college1.code = 4589;
		
		College college2 = new College();
		college2.name = "AnnaUni";
		college2.grade = "A";
		college2.fees = 90000;
		college2.code = 6542;
		
		College college3 = new College();
		college3.name = "SNS";
		college3.grade = "A";
		college3.fees = 60000;
		college3.code = 7589;
		
		College[] colle = new College[3];
		colle[0] = college1;
		colle[1] = college2;
		colle[2] = college3;
		
		
		System.out.println(college2.findMaxFeesCode(colle));
		System.out.println(college1.minCollFees(colle));
		
		
	}

}
