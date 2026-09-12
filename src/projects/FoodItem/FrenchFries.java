package projects.FoodItem;

public class FrenchFries extends FoodItems{
	
	    String size;
	    String seasoning;
	    boolean cheeseDip;

	    FrenchFries() {

	    }

	    FrenchFries(String name, double price, String restaurantName, String size, String seasoning, boolean cheeseDip) {

	        super(name, price, restaurantName);
	        this.size = size;
	        this.seasoning = seasoning;
	        this.cheeseDip = cheeseDip;
	    }
	

}
