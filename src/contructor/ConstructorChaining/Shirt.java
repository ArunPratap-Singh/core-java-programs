package contructor.ConstructorChaining;

public class Shirt {
	
	    String brand;
	    String size;
	    String fabric;
	    double price;
	    int quantity;
	    String color;
	    String pattern;
	    String sleeveType;

	    Shirt(String brand, String size, String fabric, double price, int quantity, String color, String pattern, String sleeveType) {

	        this.brand = brand;
	        this.size = size;
	        this.fabric = fabric;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.pattern = pattern;
	        this.sleeveType = sleeveType;
	    }

	    Shirt() {
	    }

	    Shirt(String brand) {
	        this.brand = brand;
	    }

	    Shirt(String brand, String size) {
	        this(brand);
	        this.size = size;
	    }

	    Shirt(String brand, String size, String fabric) {
	        this(brand, size);
	        this.fabric = fabric;
	    }

	    Shirt(String brand, String size, String fabric, double price) {
	        this(brand, size, fabric);
	        this.price = price;
	    }

	    Shirt(String brand, String size, String fabric, double price, int quantity) {
	        this(brand, size, fabric, price);
	        this.quantity = quantity;
	    }

	    Shirt(String brand, String size, String fabric, double price, int quantity, String color) {
	        this(brand, size, fabric, price, quantity);
	        this.color = color;
	    }

	    Shirt(String brand, String size, String fabric, double price, int quantity, String color, String pattern) {
	        this(brand, size, fabric, price, quantity, color);
	        this.pattern = pattern;
	    }

	    Shirt(int quantity, String brand, String size, String fabric, double price, String color, String pattern, String sleeveType) {

	        this(brand, size, fabric, price, quantity, color, pattern);
	        this.sleeveType = sleeveType;
	    }

	    public String toString() {

	        return "Brand is: " + brand + "\tSize is: " + size + "\tFabric is: " + fabric + "\nPrice is: " + price + "\tQuantity is: " + quantity + "\tColor is: " + color  + "\nPattern is: " + pattern  + "\tSleeve Type is: " + sleeveType + "\n===============================================";
	    }
	

}
