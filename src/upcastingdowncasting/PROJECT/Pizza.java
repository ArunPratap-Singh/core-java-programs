package upcastingdowncasting.PROJECT;

public class Pizza extends FastFood{
	
	char size;
	String toppings;
	
	Pizza(){
		
	}
	
	Pizza(String name, int price, int quantity, char size, String toppings){
		
		super(name, price, quantity);
		this.size = size;
		this.quantity = quantity;
	}

}
