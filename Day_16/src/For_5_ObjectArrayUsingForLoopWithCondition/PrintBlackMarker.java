package For_5_ObjectArrayUsingForLoopWithCondition;

public class PrintBlackMarker {
	public static void main(String[] args) {
	Marker marker1 = new Marker();
	marker1.brand = "Doms";
	marker1.price = 40;
	marker1.color = "black";
	marker1.isRefillable = true;
	
	Marker marker2 = new Marker();
	marker2.brand = "Camel";
	marker2.price = 60;
	marker2.color = "blue";
	marker2.isRefillable = true;
	
	Marker marker3 = new Marker();
	marker3.brand = "Nataraj";
	marker3.price = 30;
	marker3.color = "black";
	marker3.isRefillable = false;
	
	Marker[] markers = {marker1, marker2, marker3};
	for(int i=0; i<markers.length; i++) {
		if(markers[i].color.equalsIgnoreCase("black")) {
			System.out.println("Brand : "+markers[i].price+", Color : "+markers[i].color+", Refillable : "+markers[i].isRefillable);
		}
	}
	
	

}
}
