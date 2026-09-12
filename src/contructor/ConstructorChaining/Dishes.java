package contructor.ConstructorChaining;

public class Dishes {
	
	    String name;
	    String type;
	    String cuisine;
	    int quantity;
	    double price;
	    String taste;
	    String chef;
	    String restaurant;

	    Dishes(String name, String type, String cuisine, int quantity,
	           double price, String taste, String chef, String restaurant) {

	        this.name = name;
	        this.type = type;
	        this.cuisine = cuisine;
	        this.quantity = quantity;
	        this.price = price;
	        this.taste = taste;
	        this.chef = chef;
	        this.restaurant = restaurant;
	    }

	    Dishes() {
	    }

	    Dishes(String name) {
	        this.name = name;
	    }

	    Dishes(String name, String type) {
	        this(name);
	        this.type = type;
	    }

	    Dishes(String name, String type, String cuisine) {
	        this(name, type);
	        this.cuisine = cuisine;
	    }

	    Dishes(String name, String type, String cuisine, int quantity) {
	        this(name, type, cuisine);
	        this.quantity = quantity;
	    }

	    Dishes(String name, String type, String cuisine, int quantity, double price) {
	        this(name, type, cuisine, quantity);
	        this.price = price;
	    }

	    Dishes(String name, String type, String cuisine, int quantity, double price, String taste) {
	        this(name, type, cuisine, quantity, price);
	        this.taste = taste;
	    }

	    Dishes(String name, String type, String cuisine, int quantity, double price, String taste, String chef) {
	        this(name, type, cuisine, quantity, price, taste);
	        this.chef = chef;
	    }

	    Dishes(int quantity, String name, String type, String cuisine, double price, String taste, String chef, String restaurant) {
	        this(name, type, cuisine, quantity, price, taste, chef);
	        this.restaurant = restaurant;
	    }

	    public String toString() {

	        return "Name is: " + name + "\tType is: " + type + "\tCuisine is: " + cuisine + "\tQuantity is: " + quantity + "\nPrice is: " + price + "\tTaste is: " + taste + "\tChef is: " + chef + "\tRestaurant is: " + restaurant + "\n===============================================";
	    }
	

}
