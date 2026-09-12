package projects.FoodItem;

public class Samosa extends FoodItems{
	
	    int quantity;
	    String filling;
	    String chutneyType;

	    Samosa() {

	    }

	    Samosa(String name, double price, String restaurantName, int quantity, String filling, String chutneyType) {

	        super(name, price, restaurantName);

	        this.quantity = quantity;
	        this.filling = filling;
	        this.chutneyType = chutneyType;
	    }
	

}
