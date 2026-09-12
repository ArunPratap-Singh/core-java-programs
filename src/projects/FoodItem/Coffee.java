package projects.FoodItem;

public class Coffee extends FoodItems{
	
	    String coffeeType;
	    String size;
	    boolean sugarAdded;
	    
	    Coffee(){
	    	
	    }

	    Coffee(String name, double price, String restaurantName, String coffeeType, String size, boolean sugarAdded) {

	        super(name, price, restaurantName);
	        this.coffeeType = coffeeType;
	        this.size = size;
	        this.sugarAdded = sugarAdded;
	    }
	

}
