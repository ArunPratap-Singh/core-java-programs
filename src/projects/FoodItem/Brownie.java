package projects.FoodItem;

public class Brownie extends FoodItems{
	
	    String flavour;
	    boolean iceCreamAdded;
	    String topping;
	    
	    Brownie(){
	    	
	    }

	    Brownie(String name, double price, String restaurantName, String flavour, boolean iceCreamAdded, String topping) {

	        super(name, price, restaurantName);
	        this.flavour = flavour;
	        this.iceCreamAdded = iceCreamAdded;
	        this.topping = topping;
	    }
	

}
