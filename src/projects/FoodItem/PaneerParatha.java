package projects.FoodItem;

public class PaneerParatha extends FoodItems{
	
		int pieces;
	    String spiceLevel;
	    boolean butterAdded;
	    
	    PaneerParatha(){
	    	
	    }

	    PaneerParatha(String name, double price, String restaurantName, int pieces, String spiceLevel, boolean butterAdded) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.spiceLevel = spiceLevel;
	        this.butterAdded = butterAdded;
	    }
	

}
