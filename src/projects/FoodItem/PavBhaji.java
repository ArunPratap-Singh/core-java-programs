package projects.FoodItem;

public class PavBhaji extends FoodItems{
	
	    int pavPieces;
	    String spiceLevel;
	    boolean butterAdded;
	    
	    PavBhaji(){
	    	
	    }

	    PavBhaji(String name, double price, String restaurantName, int pavPieces, String spiceLevel, boolean butterAdded) {

	        super(name, price, restaurantName);
	        this.pavPieces = pavPieces;
	        this.spiceLevel = spiceLevel;
	        this.butterAdded = butterAdded;
	    }
	

}
