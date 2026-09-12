package projects.FoodItem;

public class GulabJamun extends FoodItems{
	
	    int pieces;
	    String sweetnessLevel;
	    boolean servedHot;

	    GulabJamun() {

	    }

	    GulabJamun(String name, double price, String restaurantName, int pieces, String sweetnessLevel, boolean servedHot) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.sweetnessLevel = sweetnessLevel;
	        this.servedHot = servedHot;
	    }
	

}
