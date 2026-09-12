package contructor.ConstructorChaining;

public class Sweets {
	
		String name;
	    String type;
	    int quantity;
	    double price;
	    String flavor;
	    String shape;
	    String color;
	    String shop;

	    
	    Sweets() {
	    }

	    Sweets(String name) {
	        this.name = name;
	    }

	    Sweets(String name, String type) {
	        this(name);
	        this.type = type;
	    }

	    Sweets(String name, String type, int quantity) {
	        this(name, type);
	        this.quantity = quantity;
	    }

	    Sweets(String name, String type, int quantity, double price) {
	        this(name, type, quantity);
	        this.price = price;
	    }

	    Sweets(String name, String type, int quantity, double price, String flavor) {
	        this(name, type, quantity, price);
	        this.flavor = flavor;
	    }

	    Sweets(String name, String type, int quantity, double price, String flavor, String shape) {
	        this(name, type, quantity, price, flavor);
	        this.shape = shape;
	    }

	    Sweets(String name, String type, int quantity, double price, String flavor, String shape, String color) {
	        this(name, type, quantity, price, flavor, shape);
	        this.color = color;
	    }

	    Sweets(int quantity, String name, String type, double price, String flavor, String shape, String color, String shop) {
	        this(name, type, quantity, price, flavor, shape, color);
	        this.shop = shop;
	    }

	    Sweets(String name, String type, int quantity, double price, String flavor, String shape, String color, String shop) {
	        this.name = name;
	        this.type = type;
	        this.quantity = quantity;
	        this.price = price;
	        this.flavor = flavor;
	        this.shape = shape;
	        this.color = color;
	        this.shop = shop;
	    }

	    public String toString() {
	        return "Name is: " + name + "\tType is: " + type + "\tQuantity is: " + quantity + "\tPrice is: " + price + "\nFlavor is: " + flavor + "\tShape is: " + shape + "\tColor is: " + color + "\tShop is: " + shop + "\n==========================================";
	    }
	

}
