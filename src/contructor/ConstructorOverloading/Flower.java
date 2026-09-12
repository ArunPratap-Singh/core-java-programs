package contructor.ConstructorOverloading;

public class Flower {
	
	    String name;
	    String type;
	    double price;
	    int quantity;
	    String color;
	    String season;
	    double height;

	    Flower() {
	    }

	    Flower(String name) {
	        this.name = name;
	    }

	    Flower(int quantity) {
	        this.quantity = quantity;
	    }

	    Flower(double price) {
	        this.price = price;
	    }

	    Flower(long height) {
	        this.height = height;
	    }

	    Flower(int quantity, String name) {
	        this.quantity = quantity;
	        this.name = name;
	    }

	    Flower(String name, int quantity) {
	        this.name = name;
	        this.quantity = quantity;
	    }

	    Flower(double price, String type) {
	        this.price = price;
	        this.type = type;
	    }

	    Flower(String type, double price) {
	        this.type = type;
	        this.price = price;
	    }

	    Flower(int quantity, double height) {
	        this.quantity = quantity;
	        this.height = height;
	    }

	    Flower(double height, int quantity) {
	        this.height = height;
	        this.quantity = quantity;
	    }

	    Flower(String name, int quantity, String season) {
	        this.name = name;
	        this.quantity = quantity;
	        this.season = season;
	    }

	    Flower(String color, String season, double height) {
	        this.color = color;
	        this.season = season;
	        this.height = height;
	    }

	    Flower(int quantity, double price, double height) {
	        this.quantity = quantity;
	        this.price = price;
	        this.height = height;
	    }

	    Flower(String name, String type, double price, int quantity) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    Flower(String name, double price, String season, String color) {
	        this.name = name;
	        this.price = price;
	        this.season = season;
	        this.color = color;
	    }

	    Flower(String name, String type, double price, int quantity, String season) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	        this.quantity = quantity;
	        this.season = season;
	    }

	    Flower(String name, double price, int quantity, String color, String season) {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.season = season;
	    }

	    Flower(String name, String type, double price, int quantity, String color, String season) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.season = season;
	    }

	    Flower(String name, String type, double price, int quantity, String color, String season, double height) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.season = season;
	        this.height = height;
	    }

	    public String toString() {
	        return "Name is: " + name + "\nType is: " + type + "\nPrice is: " + price + "\nQuantity is: " + quantity + "\nColor is: " + color + "\nSeason is: " + season + "\nHeight is: " + height + "\n==============================";
	    }
	

}
