package projects.FoodItem;

public class Biryani extends FoodItems{
	
	    String biryaniType;
	    int quantity;
	    boolean raitaIncluded;

	    Biryani() {

	    }

	    Biryani(String name, double price, String restaurantName, String biryaniType, int quantity, boolean raitaIncluded) {

	        super(name, price, restaurantName);
	        this.biryaniType = biryaniType;
	        this.quantity = quantity;
	        this.raitaIncluded = raitaIncluded;
	    }
	

}
