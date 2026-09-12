package projects.FoodItem;

public class CholeBhature extends FoodItems{
	
	    int bhatureQuantity;
	    String choleType;
	    boolean pickleIncluded;

	    CholeBhature() {

	    }

	    CholeBhature(String name, double price, String restaurantName, int bhatureQuantity, String choleType, boolean pickleIncluded) {

	        super(name, price, restaurantName);
	        this.bhatureQuantity = bhatureQuantity;
	        this.choleType = choleType;
	        this.pickleIncluded = pickleIncluded;
	    }
	

}
