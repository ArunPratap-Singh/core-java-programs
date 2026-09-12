package projects.FoodItem;

public class Pasta extends FoodItems{
	
	    String pastaType;
	    String sauceType;
	    String spiceLevel;

	    Pasta() {

	    }

	    Pasta(String name, double price, String restaurantName, String pastaType, String sauceType, String spiceLevel) {

	        super(name, price, restaurantName);
	        this.pastaType = pastaType;
	        this.sauceType = sauceType;
	        this.spiceLevel = spiceLevel;
	    }
	

}
