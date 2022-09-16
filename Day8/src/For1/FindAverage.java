package For1;

public class FindAverage {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		for(int i=1; i<=10; i++) {
			total = total+i;
			count = count+1;
			//System.out.println(count);
		}
		int average = total/count;
		System.out.println("Loop Count Is : "+count);
		System.out.println("Total Of i Is : "+total);
		System.out.println("Average of i Is : "+average);
	}

}
