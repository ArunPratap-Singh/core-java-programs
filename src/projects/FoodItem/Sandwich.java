package projects.FoodItem;

public class Sandwich extends FoodItems{
	
	    String breadType;
	    String filling;
	    boolean grilled;

	    Sandwich() {

	    }

	    Sandwich(String name, double price, String restaurantName, String breadType, String filling, boolean grilled) {

	        super(name, price, restaurantName);

	        this.breadType = breadType;
	        this.filling = filling;
	        this.grilled = grilled;
	    }
	

}
