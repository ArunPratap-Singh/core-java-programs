package projects.FoodItem;

public class Donut extends FoodItems{
	
	    String flavour;
	    String topping;
	    boolean filled;

	    Donut() {

	    }

	    Donut(String name, double price, String restaurantName, String flavour, String topping, boolean filled) {

	        super(name, price, restaurantName);
	        this.flavour = flavour;
	        this.topping = topping;
	        this.filled = filled;
	    }
	

}
