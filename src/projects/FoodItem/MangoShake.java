package projects.FoodItem;

public class MangoShake extends FoodItems{
	
	    String size;
	    boolean sugarAdded;
	    boolean iceCreamAdded;
	    
	    MangoShake(){
	    	
	    }

	    MangoShake(String name, double price, String restaurantName, String size, boolean sugarAdded, boolean iceCreamAdded) {

	        super(name, price, restaurantName);
	        this.size = size;
	        this.sugarAdded = sugarAdded;
	        this.iceCreamAdded = iceCreamAdded;
	    }
	

}
