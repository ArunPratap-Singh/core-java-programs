package contructor.ConstructorOverloading;

public class Birds {
	
	    String name;
	    int id;
	    double price;
	    String color;

	    Birds() {

	    }

	    Birds(int id) {
	        this.id = id;
	    }

	    Birds(double price) {
	        this.price = price;
	    }

	    Birds(String color) {
	        this.color = color;
	    }

	    Birds(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    Birds(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    Birds(double price, String color) {
	        this.price = price;
	        this.color = color;
	    }

	    Birds(String color, double price) {
	        this.color = color;
	        this.price = price;
	    }

	    Birds(int id, double price) {
	        this.id = id;
	        this.price = price;
	    }

	    Birds(double price, int id) {
	        this.price = price;
	        this.id = id;
	    }

	    Birds(String name, int id, double price) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	    }

	    Birds(String name, double price, int id) {
	        this.name = name;
	        this.price = price;
	        this.id = id;
	    }

	    Birds(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    Birds(int id, double price, String color) {
	        this.id = id;
	        this.price = price;
	        this.color = color;
	    }

	    Birds(double price, String name, String color) {
	        this.price = price;
	        this.name = name;
	        this.color = color;
	    }

	    Birds(String name, String color, double price) {
	        this.name = name;
	        this.color = color;
	        this.price = price;
	    }

	    Birds(String name, int id, double price, String color) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	        this.color = color;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nId is: " + id + "\nPrice is: " + price + "\nColor is: " + color + "\n============================================";

	    }
	

}
