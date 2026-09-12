package projects.FoodItem;

public class Noodles extends FoodItems{
	
	    String noodleType;
	    String sauce;
	    String spiceLevel;

	    Noodles() {

	    }

	    Noodles(String name, double price, String restaurantName, String noodleType, String sauce, String spiceLevel) {

	        super(name, price, restaurantName);
	        this.noodleType = noodleType;
	        this.sauce = sauce;
	        this.spiceLevel = spiceLevel;
	    }
	

}
