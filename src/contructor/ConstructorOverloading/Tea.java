package contructor.ConstructorOverloading;

public class Tea {
	
	    String name;
	    int id;
	    double price;
	    String brand;

	    Tea() {

	    }

	    Tea(String name) {
	        this.name = name;
	    }

	    Tea(int id) {
	        this.id = id;
	    }

	    Tea(double price) {
	        this.price = price;
	    }

	    Tea(char quality) {
	        // constructor using char
	    }

	    Tea(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    Tea(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    Tea(double price, String brand) {
	        this.price = price;
	        this.brand = brand;
	    }

	    Tea(String brand, double price) {
	        this.brand = brand;
	        this.price = price;
	    }

	    Tea(int id, double price) {
	        this.id = id;
	        this.price = price;
	    }

	    Tea(double price, int id) {
	        this.price = price;
	        this.id = id;
	    }

	    Tea(String name, int id, double price) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	    }

	    Tea(String name, double price, int id) {
	        this.name = name;
	        this.price = price;
	        this.id = id;
	    }

	    Tea(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    Tea(int id, double price, String brand) {
	        this.id = id;
	        this.price = price;
	        this.brand = brand;
	    }

	    Tea(double price, String name, String brand) {
	        this.price = price;
	        this.name = name;
	        this.brand = brand;
	    }

	    Tea(String name, String brand, double price) {
	        this.name = name;
	        this.brand = brand;
	        this.price = price;
	    }

	    Tea(String name, int id, double price, String brand) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	        this.brand = brand;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nId is: " + id + "\nPrice is: " + price + "\nBrand is: " + brand + "\n============================================";

	    }
	

}
