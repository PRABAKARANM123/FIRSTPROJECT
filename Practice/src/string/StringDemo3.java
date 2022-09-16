package string;

public class StringDemo3 { //Thread safe
	public static void main(String[] args) {
	StringDemo3 sd = new StringDemo3();
	String[] names = {"naresh", "raju", "muthu"};
	sd.joinWords(names);
}
private void joinWords(String[] names) {
	StringBuilder bui = new StringBuilder("Prabu");
	bui.insert(4,'h');
	System.out.println(bui);
	bui.replace(0,3,"MSP");//including zero and excluding 3
	System.out.println("After Repacing   "+bui);
	bui.reverse();
	System.out.println("After reverse----"+bui);
}

}
