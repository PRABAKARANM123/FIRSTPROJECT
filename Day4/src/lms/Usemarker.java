package lms;

public class Usemarker {
	public static void main(String[] args)
	{
	String[]values1=args[0].split(",");
	String[]values2=args[1].split(",");
	String[]values3=args[2].split(",");
	Marker marker1=new Marker();
	marker1.brand=values1[0];
	marker1.price=Integer.parseInt(values1[1]);
	marker1.colour=values1[2];
	System.out.println("marker1 brandname: "+marker1.brand+",price : "+marker1.price+",colour : "+marker1.colour);
	
	Marker marker2=new Marker();
	marker2.brand=values2[0];
	marker2.price=Integer.parseInt(values2[1]);
	marker2.colour=values2[2];
	System.out.println("Marker2 brandname: "+marker2.brand+",price : "+marker2.price+",colour : "+marker2.colour);
	
	Marker marker3=new Marker();
	marker3.brand=values3[0];
	marker3.price=Integer.parseInt(values3[1]);
	marker3.colour=values3[2];
	System.out.println("Marker3 brandname : "+marker3.brand+",price : "+marker3.price+",Colour : "+marker3.colour);
	
	
	}
	

}

class Marker {
	String brand;
	int price;
	String colour;
}