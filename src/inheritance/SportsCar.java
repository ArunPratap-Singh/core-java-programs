package inheritance;

public class SportsCar extends Car {
	
	String fueltype;
	String topspeed;
	boolean isturbo;
	
	SportsCar(){
		
	}
	
	SportsCar(String name, String price, int numberofwheels, String brandname, String horsepower, int numberofdoors, String fueltype, String topspeed, boolean isturbo){
		
		super.name = name;
		super.price = price;
		super.numberofwheels = numberofwheels;
		super.brandname = brandname;
		super.horsepower = horsepower;
		super.numberofdoors = numberofdoors;
		this.fueltype = fueltype;
		this.topspeed = topspeed;
		this.isturbo = isturbo;
	}
	
	public String toString() {
		return super.toString()+"\tFuel Type is: " +fueltype+"\tTopspeed is: " +topspeed+"\tIs Torbo is:" +isturbo;
	}

}
