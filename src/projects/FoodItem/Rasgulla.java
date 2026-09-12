package projects.FoodItem;

public class Rasgulla extends FoodItems{
	
	    int pieces;
	    String syrupType;
	    boolean chilled;
	    
	    Rasgulla(){
	    	
	    }

	    Rasgulla(String name, double price, String restaurantName, int pieces, String syrupType, boolean chilled) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.syrupType = syrupType;
	        this.chilled = chilled;
	    }
	

}
