package upcastingdowncasting.Product;

public class Refridgerator extends Product{
	
	String capacity;
	int numberofdoors;
	String color;
	
	Refridgerator(){
		
	}
	
	Refridgerator(String name, int price, int quantity, String capacity, int numberofdoors, String color){
		
		super(name, price, quantity);
		this.capacity = capacity;
		this.numberofdoors = numberofdoors;
		this.color = color;
	}

}
