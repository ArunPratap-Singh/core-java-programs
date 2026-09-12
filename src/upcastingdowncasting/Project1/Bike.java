package upcastingdowncasting.Project1;

public class Bike extends Vehicle{
	
	String brandname;
	String speed;
	int cc;
	
	Bike(){
		
	}
	
	Bike(String name, int price, int numberofwheels, String brandname, String speed, int cc){
		
		super(name, price, numberofwheels);
		this.brandname = brandname;
		this.speed = speed;
		this.cc = cc;
	}

}
