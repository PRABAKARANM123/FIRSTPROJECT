package collection_2;

import java.util.HashMap;

public class UsePlayers4 {
public static void main(String[] args) {
		
		Players ply1 = new Players("Sachin", 45, 30000, 10, "MumbaiIndians");
		Players ply2 = new Players("Khozhi", 35, 10000, 4, "SunRises");
		Players ply3 = new Players("Dhoni", 37, 15000, 7, "Chennai SuperKings");
		Players ply4 = new Players("Raina", 28, 10000, 6, "Kolkatta");
		Players ply5 = new Players("Jadeja", 29, 7000, 5, "Chennai SuperKings");
		
		HashMap<Integer, Players> p1 = new HashMap<>();
		HashMap<Integer, Players> p2 = new HashMap<>();
		
		p1.put(ply1.getJerseyNo(), ply1);
		p1.put(ply2.getJerseyNo(), ply2);
		p1.put(ply3.getJerseyNo(), ply3);
		p1.put(ply4.getJerseyNo(), ply4);
		p1.put(ply5.getJerseyNo(), ply5);
		
		for(Integer k: p1.keySet()) {
			if(p1.get(k).getAge()>30) {
				p2.put(k, p1.get(k));
			}
		}
		System.out.println(p2);
}
	

}
