package inheritancePrograming;

public class SportsCar extends Car{
	
	String fueltype;
	String topspeed;
	boolean isturbo;
	
	SportsCar(){
		
	}
	
	SportsCar(String name, int price, int numberofwheels, String color, String brandname, String horsepower, int numberofdoors, String fueltype, String topspeed, boolean isturbo){
		
		super(name, price, numberofwheels, color, brandname, horsepower, numberofdoors);
		this.fueltype = fueltype;
		this.topspeed = topspeed;
		this.isturbo = isturbo;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nFuel Type is: " +fueltype+"\nTopspeed is: " +topspeed+"\nIs Torbo is:" +isturbo+"\n================================";
	}
}
