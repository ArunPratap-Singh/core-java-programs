package contructor.ConstructorChaining;

public class Furniture {
	
	    String name;
	    String material;
	    String color;
	    int quantity;
	    double price;
	    String size;
	    String brand;
	    String room;

	    Furniture(String name, String material, String color, int quantity, double price, String size, String brand, String room) {

	        this.name = name;
	        this.material = material;
	        this.color = color;
	        this.quantity = quantity;
	        this.price = price;
	        this.size = size;
	        this.brand = brand;
	        this.room = room;
	    }

	    Furniture() {
	    }

	    Furniture(String name) {
	        this.name = name;
	    }

	    Furniture(String name, String material) {
	        this(name);
	        this.material = material;
	    }

	    Furniture(String name, String material, String color) {
	        this(name, material);
	        this.color = color;
	    }

	    Furniture(String name, String material, String color, int quantity) {
	        this(name, material, color);
	        this.quantity = quantity;
	    }

	    Furniture(String name, String material, String color, int quantity, double price) {
	        this(name, material, color, quantity);
	        this.price = price;
	    }

	    Furniture(String name, String material, String color, int quantity, double price, String size) {
	        this(name, material, color, quantity, price);
	        this.size = size;
	    }

	    Furniture(String name, String material, String color, int quantity, double price, String size, String brand) {
	        this(name, material, color, quantity, price, size);
	        this.brand = brand;
	    }

	    Furniture(int quantity, String name, String material, String color, double price, String size, String brand, String room) {
	        this(name, material, color, quantity, price, size, brand);
	        this.room = room;
	    }

	    public String toString() {

	        return "Name is: " + name + "\tMaterial is: " + material + "\tColor is: " + color + "\tQuantity is: " + quantity + "\nPrice is: " + price + "\tSize is: " + size  + "\tBrand is: " + brand + "\tRoom is: " + room  + "\n===============================================";
	    }
	

}
