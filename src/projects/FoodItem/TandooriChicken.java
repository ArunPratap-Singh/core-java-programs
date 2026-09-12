package projects.FoodItem;

public class TandooriChicken extends FoodItems{
	
	    int pieces;
	    String spiceLevel;
	    boolean mintChutney;
	    
	    TandooriChicken(){
	    	
	    }

	    TandooriChicken(String name, double price, String restaurantName, int pieces, String spiceLevel, boolean mintChutney) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.spiceLevel = spiceLevel;
	        this.mintChutney = mintChutney;
	    }
	

}
