package projects.FoodItem;

public class Idli extends FoodItems{
	
	    int pieces;
	    String chutneyType;
	    boolean sambarIncluded;

	    Idli() {

	    }

	    Idli(String name, double price, String restaurantName, int pieces, String chutneyType, boolean sambarIncluded) {

	        super(name, price, restaurantName);
	        this.pieces = pieces;
	        this.chutneyType = chutneyType;
	        this.sambarIncluded = sambarIncluded;
	    }
	

}
