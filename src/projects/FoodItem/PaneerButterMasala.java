package projects.FoodItem;

public class PaneerButterMasala extends FoodItems{
	
	    String gravyType;
	    String spiceLevel;
	    boolean butterAdded;
	    
	    PaneerButterMasala(){
	    	
	    }

	    PaneerButterMasala(String name, double price, String restaurantName, String gravyType, String spiceLevel, boolean butterAdded) {

	        super(name, price, restaurantName);
	        this.gravyType = gravyType;
	        this.spiceLevel = spiceLevel;
	        this.butterAdded = butterAdded;
	    }
	

}
