package collection_2;

import java.util.HashMap;

public class UsePlayers3 {
	public static void main(String[] args) {
		
		Players ply1 = new Players("Sachin", 45, 30000, 10, "MumbaiIndians");
		Players ply2 = new Players("Khozhi", 35, 10000, 4, "SunRises");
		Players ply3 = new Players("Dhoni", 37, 15000, 7, "Chennai SuperKings");
		Players ply4 = new Players("Raina", 35, 10000, 6, "Kolkatta");
		Players ply5 = new Players("Jadeja", 32, 7000, 5, "Chennai SuperKings");
		
		HashMap<Integer, Players> players = new HashMap<>();
		HashMap<Integer, Players> ep = new HashMap<>();
		
		players.put(ply1.getJerseyNo(), ply1);
		players.put(ply2.getJerseyNo(), ply2);
		players.put(ply3.getJerseyNo(), ply3);
		players.put(ply4.getJerseyNo(), ply4);
		players.put(ply5.getJerseyNo(), ply5);
		
		for(Integer k: players.keySet()) {
			if(k%2==0) {
				ep.put(k, players.get(k));
				//System.out.println(ep);
			}
		}
		System.out.println(ep);
		
//		
//		players.keySet().forEach(x->{
//			if(x%2==0) {
//				ep.put(x, players.get(x));
//			}
//		
//			});
	}

}
