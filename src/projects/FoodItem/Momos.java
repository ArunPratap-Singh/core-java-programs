package projects.FoodItem;

public class Momos extends FoodItems{
	
	    String momoType;
	    int pieces;
	    boolean fried;

	    Momos() {

	    }

	    Momos(String name, double price, String restaurantName, String momoType, int pieces, boolean fried) {

	        super(name, price, restaurantName);
	        this.momoType = momoType;
	        this.pieces = pieces;
	        this.fried = fried;
	    }
	

}
