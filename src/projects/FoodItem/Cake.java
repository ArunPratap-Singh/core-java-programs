package projects.FoodItem;

public class Cake extends FoodItems{
	
	    String flavour;
	    double weight;
	    boolean eggless;

	    Cake() {

	    }

	    Cake(String name, double price, String restaurantName, String flavour, double weight, boolean eggless) {

	        super(name, price, restaurantName);
	        this.flavour = flavour;
	        this.weight = weight;
	        this.eggless = eggless;
	    }
	

}
