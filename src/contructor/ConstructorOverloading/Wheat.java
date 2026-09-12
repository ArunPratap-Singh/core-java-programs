package contructor.ConstructorOverloading;

public class Wheat {

	    String variety;
	    String quality;
	    double price;
	    int quantity;
	    String color;
	    String origin;
	    double weight;

	    Wheat() {
	    }

	    
	    Wheat(String variety) {
	        this.variety = variety;
	    }

	    Wheat(int quantity) {
	        this.quantity = quantity;
	    }

	    Wheat(double price) {
	        this.price = price;
	    }

	    Wheat(long weight) {
	        this.weight = weight;
	    }

	    Wheat(int quantity, String variety) {
	        this.quantity = quantity;
	        this.variety = variety;
	    }

	    Wheat(String variety, int quantity) {
	        this.variety = variety;
	        this.quantity = quantity;
	    }

	    Wheat(double price, String quality) {
	        this.price = price;
	        this.quality = quality;
	    }

	    Wheat(String quality, double price) {
	        this.quality = quality;
	        this.price = price;
	    }

	    Wheat(int quantity, double weight) {
	        this.quantity = quantity;
	        this.weight = weight;
	    }

	    Wheat(double weight, int quantity) {
	        this.weight = weight;
	        this.quantity = quantity;
	    }

	    Wheat(String variety, int quantity, String origin) {
	        this.variety = variety;
	        this.quantity = quantity;
	        this.origin = origin;
	    }

	    Wheat(String color, String origin, double weight) {
	        this.color = color;
	        this.origin = origin;
	        this.weight = weight;
	    }

	    Wheat(int quantity, double price, double weight) {
	        this.quantity = quantity;
	        this.price = price;
	        this.weight = weight;
	    }

	    Wheat(String variety, String quality, double price, int quantity) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    Wheat(String variety, double price, String origin, String color) {

	        this.variety = variety;
	        this.price = price;
	        this.origin = origin;
	        this.color = color;
	    }

	    Wheat(String variety, String quality, double price, int quantity, String origin) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	        this.origin = origin;
	    }

	    Wheat(String variety, double price, int quantity, String color, String origin) {

	        this.variety = variety;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.origin = origin;
	    }

	    Wheat(String variety, String quality, double price, int quantity, String color, String origin) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.origin = origin;
	    }

	    Wheat(String variety, String quality, double price, int quantity, String color, String origin, double weight) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.origin = origin;
	        this.weight = weight;
	    }

	    public String toString() {

	        return "Variety is: " + variety + "\nQuality is: " + quality + "\nPrice is: " + price + "\nQuantity is: " + quantity + "\nColor is: " + color + "\nOrigin is: " + origin + "\nWeight is: " + weight + "\n==============================";
	    }
	

}
