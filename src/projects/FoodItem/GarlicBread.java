package projects.FoodItem;

public class GarlicBread extends FoodItems{
	
	    int pieces;
	    String breadType;
	    boolean cheeseAdded;
	    
	    GarlicBread(){
	    	
	    }

	    GarlicBread(String name, double price, String restaurantName, int pieces, String breadType, boolean cheeseAdded) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.breadType = breadType;
	        this.cheeseAdded = cheeseAdded;
	    }
	

}
