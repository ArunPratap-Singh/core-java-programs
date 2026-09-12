package projects.FoodItem;

public class ColdCoffee extends FoodItems{
	
	    String size;
	    String flavour;
	    boolean iceCreamAdded;
	    
	    ColdCoffee(){
	    	
	    }

	    ColdCoffee(String name, double price, String restaurantName, String size, String flavour, boolean iceCreamAdded) {

	        super(name, price, restaurantName);
	        this.size = size;
	        this.flavour = flavour;
	        this.iceCreamAdded = iceCreamAdded;
	    }
	

}
