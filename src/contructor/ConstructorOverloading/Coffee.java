package contructor.ConstructorOverloading;

public class Coffee {
	
	
	    String name;
	    int id;
	    double price;
	    String brand;

	    Coffee() {

	    }

	    Coffee(String name) {
	        this.name = name;
	    }

	    Coffee(int id) {
	        this.id = id;
	    }

	    Coffee(double price) {
	        this.price = price;
	    }

	    Coffee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    Coffee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    Coffee(double price, String brand) {
	        this.price = price;
	        this.brand = brand;
	    }

	    Coffee(String brand, double price) {
	        this.brand = brand;
	        this.price = price;
	    }

	    Coffee(int id, double price) {
	        this.id = id;
	        this.price = price;
	    }

	    Coffee(double price, int id) {
	        this.price = price;
	        this.id = id;
	    }

	    Coffee(String name, int id, double price) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	    }

	    Coffee(String name, double price, int id) {
	        this.name = name;
	        this.price = price;
	        this.id = id;
	    }

	    Coffee(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    Coffee(int id, double price, String brand) {
	        this.id = id;
	        this.price = price;
	        this.brand = brand;
	    }

	    Coffee(double price, String name, String brand) {
	        this.price = price;
	        this.name = name;
	        this.brand = brand;
	    }

	    Coffee(String name, String brand, double price) {
	        this.name = name;
	        this.brand = brand;
	        this.price = price;
	    }

	    Coffee(String name, int id, double price, String brand) {
	        this.name = name;
	        this.id = id;
	        this.price = price;
	        this.brand = brand;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nId is: " + id + "\nPrice is: " + price + "\nBrand is: " + brand + "\n============================================";

	    }
	

}
