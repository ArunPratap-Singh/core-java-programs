package contructor.ConstructorOverloading;

public class Dishes {
	
	    String name;
	    int id;
	    double price;
	    String category;

	    Dishes() {

	    }

	    Dishes(String name) {
	        this.name = name;
	    }

	    Dishes(int id) {
	        this.id = id;
	    }

	    Dishes(double price) {
	        this.price = price;
	    }

	    Dishes(char type) {
	        // Constructor using char
	    }

	    Dishes(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    Dishes(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    Dishes(double price, String category) {
	        this.price = price;
	        this.category = category;
	    }

	    Dishes(String category, double price) {
	        this.category = category;
	        this.price = price;
	    }

	    Dishes(int id, double price) {
	        this.id = id;
	        this.price = price;
	    }

	    Dishes(double price, int id) {
	        this.price = price;
	        this.id = id;
	    }

	    Dishes(String name, int id, double price) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	    }

	    Dishes(String name, double price, int id) {
	        this.name = name;
	        this.price = price;
	        this.id = id;
	    }

	    Dishes(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    Dishes(int id, double price, String category) {
	        this.id = id;
	        this.price = price;
	        this.category = category;
	    }

	    Dishes(double price, String name, String category) {
	        this.price = price;
	        this.name = name;
	        this.category = category;
	    }

	    Dishes(String name, String category, double price) {
	        this.name = name;
	        this.category = category;
	        this.price = price;
	    }

	    Dishes(String name, int id, double price, String category) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	        this.category = category;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nId is: " + id + "\nPrice is: " + price + "\nCategory is: " + category + "\n============================================";

	    }
	

}
