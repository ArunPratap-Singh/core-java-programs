package projects.FoodItem;

public class Rolls extends FoodItems{
	
	    String rollType;
	    String filling;
	    String sauceType;

	    Rolls() {

	    }

	    Rolls(String name, double price, String restaurantName, String rollType, String filling, String sauceType) {

	        super(name, price, restaurantName);

	        this.rollType = rollType;
	        this.filling = filling;
	        this.sauceType = sauceType;
	    }
	

}
