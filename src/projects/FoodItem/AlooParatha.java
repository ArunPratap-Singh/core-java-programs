package projects.FoodItem;

public class AlooParatha extends FoodItems{
	
	    int pieces;
	    boolean butterAdded;
	    boolean curdIncluded;
	    
	    AlooParatha(){
	    	
	    }

	    AlooParatha(String name, double price, String restaurantName, int pieces, boolean butterAdded, boolean curdIncluded) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.butterAdded = butterAdded;
	        this.curdIncluded = curdIncluded;
	    }
	

}
