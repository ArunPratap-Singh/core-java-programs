package upcastingdowncasting.Project1;

public class Car extends Vehicle{
	
	String brandname;
	int numberofdoors;
	int horsepower;
	int strokes;
	
	Car(){
		
	}
	
	Car(String name, int price, int numberofwheels, String brandname, int numberofdoors, int horsepower, int strokes){
		
		super(name, price, numberofwheels);
		this.brandname = brandname;
		this.numberofdoors = numberofdoors;
		this.horsepower = horsepower;
		this.strokes = strokes;
	}

}
