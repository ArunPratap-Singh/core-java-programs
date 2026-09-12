package inheritancePrograming;

public class Car extends Vehicle{
	
	String brandname;
	String horsepower;
	int numberofdoors;
	
	Car(){
		
	}
	
	Car(String name, int price, int numberofwheels, String color, String brandname, String horsepower, int numberofdoors){
		
		super(name, price, numberofwheels, color);
		this.brandname = brandname;
		this.horsepower = horsepower;
		this.numberofdoors = numberofdoors;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nBrandname is: " +brandname+"\nHorsepower is: " +horsepower+"\nNumberofdoors is: " +numberofdoors;
	}

}
