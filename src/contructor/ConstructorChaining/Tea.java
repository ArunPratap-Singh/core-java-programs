package contructor.ConstructorChaining;

public class Tea {
	
	    String name;
	    String type;
	    String flavor;
	    int quantity;
	    double price;
	    String temperature;
	    String brand;
	    String origin;

	    Tea(String name, String type, String flavor, int quantity, double price, String temperature, String brand, String origin) {

	        this.name = name;
	        this.type = type;
	        this.flavor = flavor;
	        this.quantity = quantity;
	        this.price = price;
	        this.temperature = temperature;
	        this.brand = brand;
	        this.origin = origin;
	    }

	    Tea() {
	    }

	    Tea(String name) {
	        this.name = name;
	    }

	    Tea(String name, String type) {
	        this(name);
	        this.type = type;
	    }

	    Tea(String name, String type, String flavor) {
	        this(name, type);
	        this.flavor = flavor;
	    }

	    Tea(String name, String type, String flavor, int quantity) {
	        this(name, type, flavor);
	        this.quantity = quantity;
	    }

	    Tea(String name, String type, String flavor, int quantity, double price) {
	        this(name, type, flavor, quantity);
	        this.price = price;
	    }

	    Tea(String name, String type, String flavor, int quantity, double price, String temperature) {
	        this(name, type, flavor, quantity, price);
	        this.temperature = temperature;
	    }

	    Tea(String name, String type, String flavor, int quantity, double price, String temperature, String brand) {
	        this(name, type, flavor, quantity, price, temperature);
	        this.brand = brand;
	    }

	    Tea(int quantity, String name, String type, String flavor, double price, String temperature, String brand, String origin) {
	        this(name, type, flavor, quantity, price, temperature, brand);
	        this.origin = origin;
	    }

	    public String toString() {

	        return "Name is: " + name + "\tType is: " + type + "\tFlavor is: " + flavor + "\tQuantity is: " + quantity  + "\nPrice is: " + price  + "\tTemperature is: " + temperature  + "\tBrand is: " + brand  + "\tOrigin is: " + origin  + "\n===============================================";
	    }
	

}
