package projects.FoodItem;

public class PaneerTikka extends FoodItems{
	
	    String tikkaType;
	    int pieces;
	    String spiceLevel;

	    PaneerTikka() {

	    }

	    PaneerTikka(String name, double price, String restaurantName, String tikkaType, int pieces, String spiceLevel) {

	        super(name, price, restaurantName);

	        this.tikkaType = tikkaType;
	        this.pieces = pieces;
	        this.spiceLevel = spiceLevel;
	    }
	

}
