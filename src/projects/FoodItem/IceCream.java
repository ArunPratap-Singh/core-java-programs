package projects.FoodItem;

public class IceCream extends FoodItems{
	
	    String flavour;
	    int scoops;
	    String coneType;

	    IceCream() {

	    }

	    IceCream(String name, double price, String restaurantName, String flavour, int scoops, String coneType) {

	        super(name, price, restaurantName);
	        this.flavour = flavour;
	        this.scoops = scoops;
	        this.coneType = coneType;
	    }
	

}
