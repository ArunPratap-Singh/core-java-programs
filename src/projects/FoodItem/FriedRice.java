package projects.FoodItem;

public class FriedRice extends FoodItems{
	
	    String riceType;
	    String vegetableType;
	    String spiceLevel;

	    FriedRice() {

	    }

	    FriedRice(String name, double price, String restaurantName, String riceType, String vegetableType, String spiceLevel) {

	        super(name, price, restaurantName);
	        this.riceType = riceType;
	        this.vegetableType = vegetableType;
	        this.spiceLevel = spiceLevel;
	    }
	

}
