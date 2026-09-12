package upcastingdowncasting.PROJECT;

public class Desserts extends  FastFood{
	
	String flavour;
	boolean isEggless;
	
	Desserts() {
		
	}
	
	Desserts(String name, int price, int quantity, String flavour, boolean isEggless){
		
		super(name, price, quantity);
		this.flavour = flavour;
		this.isEggless = isEggless;
	}

}
