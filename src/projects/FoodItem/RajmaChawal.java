package projects.FoodItem;

public class RajmaChawal extends FoodItems{
	
	    String rajmaType;
	    String riceType;
	    String spiceLevel;
	    
	    RajmaChawal(){
	    	
	    }

	    RajmaChawal(String name, double price, String restaurantName, String rajmaType, String riceType, String spiceLevel) {

	        super(name, price, restaurantName);

	        this.rajmaType = rajmaType;
	        this.riceType = riceType;
	        this.spiceLevel = spiceLevel;
	    }
	

}
