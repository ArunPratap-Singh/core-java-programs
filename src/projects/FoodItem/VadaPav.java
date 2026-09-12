package projects.FoodItem;

public class VadaPav extends FoodItems{
	
	    int pieces;
	    String chutneyType;
	    boolean friedChilli;
	    
	    VadaPav(){
	    	
	    }

	    VadaPav(String name, double price, String restaurantName, int pieces, String chutneyType, boolean friedChilli) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.chutneyType = chutneyType;
	        this.friedChilli = friedChilli;
	    }
	

}
