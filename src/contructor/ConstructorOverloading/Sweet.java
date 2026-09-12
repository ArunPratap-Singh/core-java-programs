package contructor.ConstructorOverloading;

public class Sweet {
	
	    String name;
	    int quantity;
	    double price;
	    String type;

	    Sweet() {

	    }

	    Sweet(String name) {
	        this.name = name;
	    }

	    Sweet(int quantity) {
	        this.quantity = quantity;
	    }

	    Sweet(double price) {
	        this.price = price;
	    }

	    Sweet(String name, int quantity) {
	        this.name = name;
	        this.quantity = quantity;
	    }

	    Sweet(int quantity, String name) {
	        this.quantity = quantity;
	        this.name = name;
	    }

	    Sweet(double price, String type) {
	        this.price = price;
	        this.type = type;
	    }

	    Sweet(String type, double price) {
	        this.type = type;
	        this.price = price;
	    }

	    Sweet(int quantity, double price) {
	        this.quantity = quantity;
	        this.price = price;
	    }

	    Sweet(double price, int quantity) {
	        this.price = price;
	        this.quantity = quantity;
	    }

	    Sweet(String name, int quantity, double price) {
	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    Sweet(String name, double price, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    Sweet(int quantity, String name, double price) {
	        this.quantity = quantity;
	        this.name = name;
	        this.price = price;
	    }

	    Sweet(int quantity, double price, String type) {
	        this.quantity = quantity;
	        this.price = price;
	        this.type = type;
	    }

	    Sweet(double price, String name, String type) {
	        this.price = price;
	        this.name = name;
	        this.type = type;
	    }

	    Sweet(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }

	    Sweet(String name, int quantity, double price, String type) {
	        this.name = name;
	        this.quantity = quantity;
	        this.price = price;
	        this.type = type;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nQuantity is: " + quantity + "\nPrice is: " + price + "\nType is: " + type + "\n============================================";

	    }
	

}
