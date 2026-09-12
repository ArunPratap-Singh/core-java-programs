package projects.FoodItem;

public class Dosa extends FoodItems{

	    String dosaType;
	    String filling;
	    boolean chutneyIncluded;

	    Dosa() {

	    }

	    Dosa(String name, double price, String restaurantName, String dosaType, String filling, boolean chutneyIncluded) {

	        super(name, price, restaurantName);

	        this.dosaType = dosaType;
	        this.filling = filling;
	        this.chutneyIncluded = chutneyIncluded;
	    }
	

}
