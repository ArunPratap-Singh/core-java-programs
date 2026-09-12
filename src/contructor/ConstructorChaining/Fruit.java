package contructor.ConstructorChaining;

public class Fruit {
	
	    String name;
	    String color;
	    String taste;
	    double price;
	    int quantity;
	    String season;
	    String origin;
	    String variety;

	    Fruit(String name, String color, String taste, double price, int quantity, String season, String origin, String variety) {

	        this.name = name;
	        this.color = color;
	        this.taste = taste;
	        this.price = price;
	        this.quantity = quantity;
	        this.season = season;
	        this.origin = origin;
	        this.variety = variety;
	    }

	    Fruit() {
	    }

	    Fruit(String name) {
	        this.name = name;
	    }

	    Fruit(String name, String color) {
	        this(name);
	        this.color = color;
	    }

	    Fruit(String name, String color, String taste) {
	        this(name, color);
	        this.taste = taste;
	    }

	    Fruit(String name, String color, String taste, double price) {
	        this(name, color, taste);
	        this.price = price;
	    }

	    Fruit(String name, String color, String taste, double price, int quantity) {
	        this(name, color, taste, price);
	        this.quantity = quantity;
	    }

	    Fruit(String name, String color, String taste, double price, int quantity, String season) {
	        this(name, color, taste, price, quantity);
	        this.season = season;
	    }

	    Fruit(String name, String color, String taste, double price, int quantity, String season, String origin) {
	        this(name, color, taste, price, quantity, season);
	        this.origin = origin;
	    }

	    Fruit(int quantity, String name, String color, String taste, double price, String season, String origin, String variety) {
	        this(name, color, taste, price, quantity, season, origin);
	        this.variety = variety;
	    }

	    public String toString() {
	        return "Name is: " + name + "\tColor is: " + color + "\tTaste is: " + taste + "\nPrice is: " + price + "\tQuantity is: " + quantity + "\tSeason is: " + season + "\nOrigin is: " + origin + "\tVariety is: " + variety + "\n===============================================";
	    }
	

}
