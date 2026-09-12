package projects.FoodItem;

public class ButterChicken extends FoodItems{
	
	    String chickenType;
	    String spiceLevel;
	    boolean butterAdded;
	    
	    ButterChicken(){
	    	
	    }

	    ButterChicken(String name, double price, String restaurantName, String chickenType, String spiceLevel, boolean butterAdded) {

	        super(name, price, restaurantName);
	        this.chickenType = chickenType;
	        this.spiceLevel = spiceLevel;
	        this.butterAdded = butterAdded;
	    }
	

}
