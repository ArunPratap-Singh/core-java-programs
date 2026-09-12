package contructor.ConstructorOverloading;

public class Fruit {
	
	    String name;
	    String color;
	    double price;
	    String taste;
	    int quantity;
	    String origin;
	    double weight;

	    
	    Fruit() {
	    }

	   
	    Fruit(String name) {
	        this.name = name;
	    }

	    Fruit(int quantity) {
	        this.quantity = quantity;
	    }

	    Fruit(double price) {
	        this.price = price;
	    }

	    
	    Fruit(String name, String color) {
	        this.name = name;
	        this.color = color;
	    }

	    
	    Fruit(double price, String taste) {
	        this.price = price;
	        this.taste = taste;
	    }


	    Fruit(int quantity, double weight) {
	        this.quantity = quantity;
	        this.weight = weight;
	    }

	    Fruit(double weight, int quantity) {
	        this.weight = weight;
	        this.quantity = quantity;
	    }

	    Fruit(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    Fruit(String name, double price, String taste) {
	        this.name = name;
	        this.price = price;
	        this.taste = taste;
	    }

	    Fruit(String color, String taste, double weight) {
	        this.color = color;
	        this.taste = taste;
	        this.weight = weight;
	    }

	    Fruit(int quantity, double price, double weight) {
	        this.quantity = quantity;
	        this.price = price;
	        this.weight = weight;
	    }

	    
	    Fruit(String name, String color, double price, String taste) {
	        this.name = name;
	        this.color = color;
	        this.price = price;
	        this.taste = taste;
	    }

	    Fruit(String name, double price, int quantity, String origin) {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	        this.origin = origin;
	    }

	    Fruit(String color, String taste, int quantity, double weight) {
	        this.color = color;
	        this.taste = taste;
	        this.quantity = quantity;
	        this.weight = weight;
	    }

	    
	    Fruit(String name, String color, double price, String taste, int quantity) {
	        this.name = name;
	        this.color = color;
	        this.price = price;
	        this.taste = taste;
	        this.quantity = quantity;
	    }

	    Fruit(String name, double price, String taste, int quantity, String origin) {
	        this.name = name;
	        this.price = price;
	        this.taste = taste;
	        this.quantity = quantity;
	        this.origin = origin;
	    }
	    
	    
	    Fruit(String name, String color, double price, String taste, int quantity, String origin) {
	        this.name = name;
	        this.color = color;
	        this.price = price;
	        this.taste = taste;
	        this.quantity = quantity;
	        this.origin = origin;
	    }

	    
	    Fruit(String name, String color, double price, String taste, int quantity, String origin, double weight) {
	        this.name = name;
	        this.color = color;
	        this.price = price;
	        this.taste = taste;
	        this.quantity = quantity;
	        this.origin = origin;
	        this.weight = weight;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nColor is: " + color + "\nPrice is: " + price + "\nTaste is: " + taste + "\nQuantity is: " + quantity + "\nOrigin is: " + origin + "\nWeight is: " + weight + "\n==============================";
	    }
	

}
