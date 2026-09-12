package projects.FoodItem;

public class Pizza extends FoodItems{
	
	    String size;
	    String crustType;
	    boolean extraCheese;

	    Pizza() {

	    }

	    Pizza(String name, double price, String restaurantName, String size, String crustType, boolean extraCheese) {

	        super(name, price, restaurantName);

	        this.size = size;
	        this.crustType = crustType;
	        this.extraCheese = extraCheese;
	    }
	

}
