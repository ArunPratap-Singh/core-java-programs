package projects.FoodItem;

public class Burger extends FoodItems{
	
	    String burgerType;
	    String pattyType;
	    boolean extraCheese;

	    Burger() {

	    }

	    Burger(String name, double price, String restaurantName, String burgerType, String pattyType, boolean extraCheese) {

	        super(name, price, restaurantName);

	        this.burgerType = burgerType;
	        this.pattyType = pattyType;
	        this.extraCheese = extraCheese;
	    }
	

}
