package projects.FoodItem;

public class MasalaTea extends FoodItems{
	
	    String size;
	    boolean sugarAdded;
	    boolean gingerAdded;
	    
	    MasalaTea(){
	    	
	    }

	    MasalaTea(String name, double price, String restaurantName, String size, boolean sugarAdded, boolean gingerAdded) {

	        super(name, price, restaurantName);
	        this.size = size;
	        this.sugarAdded = sugarAdded;
	        this.gingerAdded = gingerAdded;
	    }
	

}
