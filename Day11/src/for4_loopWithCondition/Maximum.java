package for4_loopWithCondition;

public class Maximum {
	public static void main(String[] args) {
		int[] numbers = {12,19,21,2,44,34,96,100,22};
		int max = 0;
		int min = numbers[2];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max =numbers[i];
			}
			else if(numbers[i]<min) {
				min = numbers[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		}
	}


