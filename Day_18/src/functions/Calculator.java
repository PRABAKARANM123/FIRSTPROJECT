package functions;

public class Calculator {
	public int add() {   //return without parameter
		int num1 = 15;
		int num2 = 20;
		return num1+num2;
	}
	public float sub(int num1,float num2) {  //return with parameter
		return num1-num2;
		
	}
	
	public void Divide() {  //void without parameter
		float num1= 3.7f;
		float num2 = 2.6f;
		float result =  num1/num2;
		System.out.println(result);
	}
	
	public void findModules(int num1, int num2) {  //void with parameter
		System.out.println(num1%num2);
	}

}
