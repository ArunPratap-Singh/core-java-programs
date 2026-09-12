package contructor.ConstructorOverloading;

public class Shirt {
	
		String brand;
	    int size;
	    double price;
	    String color;
	    String material;
	    String type;
	    int quantity;

	    Shirt() {
	    	
	    }
	    
	    Shirt(String brand) {
	        this.brand = brand;
	    }

	    Shirt(int size) {
	        this.size = size;
	    }

	    Shirt(double price) {
	        this.price = price;
	    }

	    Shirt(long quantity) {
	        this.quantity = (int) quantity;
	    }

	    Shirt(String brand, int size) {
	        this.brand = brand;
	        this.size = size;
	    }

	    Shirt(int size, String brand) {
	        this.size = size;
	        this.brand = brand;
	    }

	    Shirt(double price, String color) {
	        this.price = price;
	        this.color = color;
	    }

	    Shirt(String color, double price) {
	        this.color = color;
	        this.price = price;
	    }

	    Shirt(int size, double price) {
	        this.size = size;
	        this.price = price;
	    }

	    Shirt(double price, int size) {
	        this.price = price;
	        this.size = size;
	    }

	    Shirt(String brand, int size, double price) {
	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	    }

	    Shirt(String brand, String color, String material) {
	        this.brand = brand;
	        this.color = color;
	        this.material = material;
	    }

	    Shirt(int size, String color, int quantity) {
	        this.size = size;
	        this.color = color;
	        this.quantity = quantity;
	    }

	    Shirt(double price, String color, String material) {
	        this.price = price;
	        this.color = color;
	        this.material = material;
	    }

	    Shirt(String brand, int size, double price, String color) {
	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	        this.color = color;
	    }

	    Shirt(String brand, String material, String type, int quantity) {
	        this.brand = brand;
	        this.material = material;
	        this.type = type;
	        this.quantity = quantity;
	    }

	    Shirt(int size, double price, String color, String material) {
	        this.size = size;
	        this.price = price;
	        this.color = color;
	        this.material = material;
	    }

	    Shirt(String brand, int size, double price, String color, String material) {

	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	        this.color = color;
	        this.material = material;
	    }

	    Shirt(String brand, double price, int size, String type, int quantity) {

	        this.brand = brand;
	        this.price = price;
	        this.size = size;
	        this.type = type;
	        this.quantity = quantity;
	    }

	    Shirt(String brand, int size, double price, String color, String material, String type) {

	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	        this.color = color;
	        this.material = material;
	        this.type = type;
	    }

	    Shirt(String brand, int size, double price, String color, String material, String type, int quantity) {

	        this.brand = brand;
	        this.size = size;
	        this.price = price;
	        this.color = color;
	        this.material = material;
	        this.type = type;
	        this.quantity = quantity;
	    }

	    public String toString() {

	        return "Brand is: " + brand + "\nSize is: " + size + "\nPrice is: " + price + "\nColor is: " + color + "\nMaterial is: " + material + "\nType is: " + type + "\nQuantity is: " + quantity + "\n==============================";
	    }
	

}
