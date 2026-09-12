package contructor.ConstructorChaining;

public class Flower {
	
	    String name;
	    String color;
	    String type;
	    double price;
	    int quantity;
	    String season;
	    String fragrance;
	    String origin;

	    Flower(String name, String color, String type, double price, int quantity, String season, String fragrance, String origin) {

	        this.name = name;
	        this.color = color;
	        this.type = type;
	        this.price = price;
	        this.quantity = quantity;
	        this.season = season;
	        this.fragrance = fragrance;
	        this.origin = origin;
	    }

	    Flower() {
	    }

	    Flower(String name) {
	        this.name = name;
	    }

	    Flower(String name, String color) {
	        this(name);
	        this.color = color;
	    }

	    Flower(String name, String color, String type) {
	        this(name, color);
	        this.type = type;
	    }

	    Flower(String name, String color, String type, double price) {
	        this(name, color, type);
	        this.price = price;
	    }

	    Flower(String name, String color, String type, double price, int quantity) {
	        this(name, color, type, price);
	        this.quantity = quantity;
	    }

	    Flower(String name, String color, String type, double price, int quantity, String season) {
	        this(name, color, type, price, quantity);
	        this.season = season;
	    }

	    Flower(String name, String color, String type, double price, int quantity, String season,  String fragrance) {
	        this(name, color, type, price, quantity, season);
	        this.fragrance = fragrance;
	    }

	    Flower(int quantity, String name, String color, String type, double price, String season, String fragrance, String origin) {
	        this(name, color, type, price, quantity, season, fragrance);
	        this.origin = origin;
	    }

	    public String toString() {
	        return "Name is: " + name + "\tColor is: " + color + "\tType is: " + type + "\nPrice is: " + price + "\tQuantity is: " + quantity + "\tSeason is: " + season + "\nFragrance is: " + fragrance + "\tOrigin is: " + origin + "\n===============================================";
	    }
	

}
