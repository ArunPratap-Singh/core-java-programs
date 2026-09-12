package projects.FoodItem;

public class Kachori extends FoodItems{
	
	    String filling;
	    int pieces;
	    boolean chutneyIncluded;
	    
	    Kachori(){
	    	
	    }

	    Kachori(String name, double price, String restaurantName, String filling, int pieces, boolean chutneyIncluded) {

	        super(name, price, restaurantName);
	        this.filling = filling;
	        this.pieces = pieces;
	        this.chutneyIncluded = chutneyIncluded;
	    }
	

}
