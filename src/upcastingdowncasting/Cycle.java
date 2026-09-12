package upcastingdowncasting;

public class Cycle extends Vehicle {
	
	String brandname;
	String type;

	Cycle(){
		
	}
	
	Cycle(String name, int price, int numberofwheels, String brandname, String type){
		
		super(name, price, numberofwheels);
		this.brandname = brandname;
		this.type = type;
	}
	
	
}
