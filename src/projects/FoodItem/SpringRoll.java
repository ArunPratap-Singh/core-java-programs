package projects.FoodItem;

public class SpringRoll extends FoodItems{
	
	    String filling;
	    int pieces;
	    String sauceType;
	    
	    SpringRoll(){
	    	
	    }

	    SpringRoll(String name, double price, String restaurantName, String filling, int pieces, String sauceType) {

	        super(name, price, restaurantName);
	        this.filling = filling;
	        this.pieces = pieces;
	        this.sauceType = sauceType;
	    }
	

}
