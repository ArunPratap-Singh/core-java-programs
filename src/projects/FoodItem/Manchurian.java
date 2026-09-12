package projects.FoodItem;

public class Manchurian extends FoodItems{
	
	    String type;
	    String sauceType;
	    String spiceLevel;
	    
	    Manchurian(){
	    	
	    }

	    Manchurian(String name, double price, String restaurantName, String type, String sauceType, String spiceLevel) {

	        super(name, price, restaurantName);
	        this.type = type;
	        this.sauceType = sauceType;
	        this.spiceLevel = spiceLevel;
	    }
	

}
