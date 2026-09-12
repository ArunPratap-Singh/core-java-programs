package inheritance;

public class Car extends Vehicle{
	
	String brandname;
	String horsepower;
	int numberofdoors;
	
	Car(){
		
	}
	
	Car(String name, String price, int numberofwheels, String brandname, String horsepower, int numberofdoors){
		
		super.name = name;
		super.price = price;
		super.numberofwheels = numberofwheels;
		this.brandname = brandname;
		this.horsepower = horsepower;
		this.numberofdoors = numberofdoors;
		}
	
	public String toString() {
		return super.toString()+"\tBrandname is: " +brandname+"\tHorsepower is: " +horsepower+"\tNumberofWheels is: " +numberofwheels;
	}
}
