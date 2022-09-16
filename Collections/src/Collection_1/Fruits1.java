package Collection_1;

import java.util.ArrayList;

public class Fruits1 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);
		System.out.println("-------------After Removing-------------");
		li.remove(2);
		System.out.println(li);
		System.out.println("-----------After Add----------");
		li.add(50);
		System.out.println(li);
	}
}
