package contructor.ConstructorOverloading;

public class Shoes {
	

	    String brand;
	    int size;
	    double price;
	    String color;

	    Shoes() {

	    }

	    Shoes(String brand) {
	        this.brand = brand;
	    }

	    Shoes(int size) {
	        this.size = size;
	    }

	    Shoes(double price) {
	        this.price = price;
	    }

	    Shoes(String brand, int size) {
	        this.brand = brand;
	        this.size = size;
	    }

	    Shoes(int size, String brand) {
	        this.size = size;
	        this.brand = brand;
	    }

	    Shoes(double price, String color) {
	        this.price = price;
	        this.color = color;
	    }

	    Shoes(String color, double price) {
	        this.color = color;
	        this.price = price;
	    }

	    Shoes(int size, double price) {
	        this.size = size;
	        this.price = price;
	    }

	    Shoes(double price, int size) {
	        this.price = price;
	        this.size = size;
	    }

	    Shoes(String brand, int size, double price) {
	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	    }

	    Shoes(String brand, double price, int size) {
	        this.brand = brand;
	        this.price = price;
	        this.size = size;
	    }

	    Shoes(int size, String brand, double price) {
	        this.size = size;
	        this.brand = brand;
	        this.price = price;
	    }

	    Shoes(int size, double price, String color) {
	        this.size = size;
	        this.price = price;
	        this.color = color;
	    }

	    Shoes(double price, String brand, String color) {
	        this.price = price;
	        this.brand = brand;
	        this.color = color;
	    }

	    Shoes(String brand, String color, double price) {
	        this.brand = brand;
	        this.color = color;
	        this.price = price;
	    }

	    Shoes(String brand, int size, double price, String color) {
	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	        this.color = color;
	    }

	    public String toString() {

	        return "Brand is: " + brand + "\nSize is: " + size + "\nPrice is: " + price + "\nColor is: " + color + "\n============================================";

	    }
	

}
