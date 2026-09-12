package projects.FoodItem;

public class Shawarma extends FoodItems{
	
	    String shawarmaType;
	    String filling;
	    boolean extraSauce;

	    Shawarma() {

	    }

	    Shawarma(String name, double price, String restaurantName, String shawarmaType, String filling, boolean extraSauce) {

	        super(name, price, restaurantName);
	        this.shawarmaType = shawarmaType;
	        this.filling = filling;
	        this.extraSauce = extraSauce;
	    }
	

}
