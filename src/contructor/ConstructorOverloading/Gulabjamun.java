package contructor.ConstructorOverloading;

public class Gulabjamun {
	
	
	    String name;
	    int quantity;
	    double price;
	    String size;

	    Gulabjamun() {

	    }

	    Gulabjamun(String name) {
	        this.name = name;
	    }

	    Gulabjamun(int quantity) {
	        this.quantity = quantity;
	    }

	    Gulabjamun(double price) {
	        this.price = price;
	    }

	    Gulabjamun(String name, int quantity) {
	        this.name = name;
	        this.quantity = quantity;
	    }

	    Gulabjamun(int quantity, String name) {
	        this.quantity = quantity;
	        this.name = name;
	    }

	    Gulabjamun(double price, String size) {
	        this.price = price;
	        this.size = size;
	    }

	    Gulabjamun(String size, double price) {
	        this.size = size;
	        this.price = price;
	    }

	    Gulabjamun(int quantity, double price) {
	        this.quantity = quantity;
	        this.price = price;
	    }

	    Gulabjamun(double price, int quantity) {
	        this.price = price;
	        this.quantity = quantity;
	    }

	    Gulabjamun(String name, int quantity, double price) {
	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    Gulabjamun(String name, double price, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    Gulabjamun(int quantity, String name, double price) {
	        this.quantity = quantity;
	        this.name = name;
	        this.price = price;
	    }

	    Gulabjamun(int quantity, double price, String size) {
	        this.quantity = quantity;
	        this.price = price;
	        this.size = size;
	    }

	    Gulabjamun(double price, String name, String size) {
	        this.price = price;
	        this.name = name;
	        this.size = size;
	    }

	    Gulabjamun(String name, String size, double price) {
	        this.name = name;
	        this.size = size;
	        this.price = price;
	    }

	    Gulabjamun(String name, int quantity, double price, String size) {
	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	        this.size = size;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nQuantity is: " + quantity + "\nPrice is: " + price + "\nSize is: " + size + "\n============================================";

	    }
	

}
