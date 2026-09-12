package upcastingdowncasting.PROJECT;

public class Burger extends FastFood{

	String type;
	String fillings;
	
	Burger(){
		
	}
	
	Burger(String name, int price, int quantity, String type, String fillings){
		
		super(name, price, quantity);
		this.type = type;
		this.fillings = fillings;
		
	}
}
