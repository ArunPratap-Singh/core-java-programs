package contructor.ConstructorOverloading;

public class Jeans {
	
	    String brand;
	    int size;
	    double price;
	    String color;

	    Jeans() {

	    }

	    Jeans(String brand) {
	        this.brand = brand;
	    }

	    Jeans(int size) {
	        this.size = size;
	    }

	    Jeans(double price) {
	        this.price = price;
	    }

	    Jeans(String brand, int size) {
	        this.brand = brand;
	        this.size = size;
	    }

	    Jeans(int size, String brand) {
	        this.size = size;
	        this.brand = brand;
	    }

	    Jeans(double price, String color) {
	        this.price = price;
	        this.color = color;
	    }

	    Jeans(String color, double price) {
	        this.color = color;
	        this.price = price;
	    }

	    Jeans(int size, double price) {
	        this.size = size;
	        this.price = price;
	    }

	    Jeans(double price, int size) {
	        this.price = price;
	        this.size = size;
	    }

	    Jeans(String brand, int size, double price) {
	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	    }

	    Jeans(String brand, double price, int size) {
	        this.brand = brand;
	        this.price = price;
	        this.size = size;
	    }

	    Jeans(int size, String brand, double price) {
	        this.size = size;
	        this.brand = brand;
	        this.price = price;
	    }

	    Jeans(int size, double price, String color) {
	        this.size = size;
	        this.price = price;
	        this.color = color;
	    }

	    Jeans(double price, String brand, String color) {
	        this.price = price;
	        this.brand = brand;
	        this.color = color;
	    }

	    Jeans(String brand, String color, double price) {
	        this.brand = brand;
	        this.color = color;
	        this.price = price;
	    }

	    Jeans(String brand, int size, double price, String color) {
	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	        this.color = color;
	    }

	    public String toString() {

	        return "Brand is: " + brand + "\nSize is: " + size + "\nPrice is: " + price + "\nColor is: " + color + "\n============================================";

	    }
	

}
