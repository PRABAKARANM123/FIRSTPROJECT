package For_5_ObjectArrayUsingForLoopWithCondition;

public class UseMarker {
	public static void main(String[] args) {
		Marker marker1 = new Marker();
		marker1.brand = "Doms";
		marker1.price = 50;
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
		marker3.color = "green";
		marker3.isRefillable = false;
		
		Marker[] marker = {marker1, marker2, marker3};
		Marker max = new Marker();  //<--emprory variable   we take object in temp
		for(int i= 0; i<marker.length; i++) {
			if(marker[i].price>max.price) {
				max = marker[i];
				
			}
		}
		System.out.println("Heighest price brand is : "+max.brand+", Price= "+max.price+", Color : "+max.color+", Refillable : "+max.isRefillable);
	}

}
