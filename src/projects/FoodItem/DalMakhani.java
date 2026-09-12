package projects.FoodItem;

public class DalMakhani extends FoodItems{
	
	    String dalType;
	    String spiceLevel;
	    boolean creamAdded;
	    
	    DalMakhani(){
	    	
	    }

	    DalMakhani(String name, double price, String restaurantName, String dalType, String spiceLevel, boolean creamAdded) {

	        super(name, price, restaurantName);
	        this.dalType = dalType;
	        this.spiceLevel = spiceLevel;
	        this.creamAdded = creamAdded;
	    }
	

}
