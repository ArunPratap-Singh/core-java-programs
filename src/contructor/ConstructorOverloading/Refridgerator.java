package contructor.ConstructorOverloading;

public class Refridgerator {
	
	    String brand;
	    int capacity;
	    double price;
	    String color;

	    Refridgerator() {

	    }

	    Refridgerator(String brand) {
	        this.brand = brand;
	    }

	    Refridgerator(int capacity) {
	        this.capacity = capacity;
	    }

	    Refridgerator(double price) {
	        this.price = price;
	    }

	    Refridgerator(String brand, int capacity) {
	        this.brand = brand;
	        this.capacity = capacity;
	    }

	    Refridgerator(int capacity, String brand) {
	        this.capacity = capacity;
	        this.brand = brand;
	    }

	    Refridgerator(double price, String color) {
	        this.price = price;
	        this.color = color;
	    }

	    Refridgerator(String color, double price) {
	        this.color = color;
	        this.price = price;
	    }

	    Refridgerator(int capacity, double price) {
	        this.capacity = capacity;
	        this.price = price;
	    }

	    Refridgerator(double price, int capacity) {
	        this.price = price;
	        this.capacity = capacity;
	    }

	    Refridgerator(String brand, int capacity, double price) {
	        this.brand = brand;
	        this.capacity = capacity;
	        this.price = price;
	    }

	    Refridgerator(String brand, double price, int capacity) {
	        this.brand = brand;
	        this.price = price;
	        this.capacity = capacity;
	    }

	    Refridgerator(int capacity, String brand, double price) {
	        this.capacity = capacity;
	        this.brand = brand;
	        this.price = price;
	    }

	    Refridgerator(int capacity, double price, String color) {
	        this.capacity = capacity;
	        this.price = price;
	        this.color = color;
	    }

	    Refridgerator(double price, String brand, String color) {
	        this.price = price;
	        this.brand = brand;
	        this.color = color;
	    }

	    Refridgerator(String brand, String color, double price) {
	        this.brand = brand;
	        this.color = color;
	        this.price = price;
	    }

	    Refridgerator(String brand, int capacity, double price, String color) {
	        this.brand = brand;
	        this.capacity = capacity;
	        this.price = price;
	        this.color = color;
	    }

	    public String toString() {

	        return "Brand is: " + brand + "\nCapacity is: " + capacity + "\nPrice is: " + price + "\nColor is: " + color + "\n============================================";

	    }
	

}
