package upcastingdowncasting;

public class Car extends Vehicle {
	
	String brands;
	int numberofdoors;
	int hp;
	int strokes;
	
	Car(){
		
	}
	
	Car(String name, int price, int numberofwheels, String brands, int numberofdoors, int hp, int strokes){
		
		super(name, price, numberofwheels);
		this.brands = brands;
		this.numberofdoors = numberofdoors;
		this.hp = hp;
		this.strokes = strokes;
		}
	
	
}
