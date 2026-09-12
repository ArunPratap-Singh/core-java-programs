package upcastingdowncasting.Product;

public class Curtains extends Product{
	
	String color;
	String length;
	String fabric;

	
	Curtains(){
		
	}
	
	Curtains(String name, int price, int quantity, String color, String length, String fabric){
		
		super(name, price, quantity);
		this.color = color;
		this.length = length;
		this.fabric = fabric;
		
	}
	

}
