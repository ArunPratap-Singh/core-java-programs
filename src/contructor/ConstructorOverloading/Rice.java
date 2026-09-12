package contructor.ConstructorOverloading;

public class Rice {

	    String variety;
	    String quality;
	    double price;
	    int quantity;
	    String color;
	    String origin;
	    double weight;

	    Rice() {
	    	
	    }

	    Rice(String variety) {
	        this.variety = variety;
	    }

	    Rice(int quantity) {
	        this.quantity = quantity;
	    }

	    Rice(double price) {
	        this.price = price;
	    }

	    Rice(long weight) {
	        this.weight = weight;
	    }

	    Rice(int quantity, String variety) {
	        this.quantity = quantity;
	        this.variety = variety;
	    }

	    Rice(String variety, int quantity) {
	        this.variety = variety;
	        this.quantity = quantity;
	    }

	    Rice(double price, String quality) {
	        this.price = price;
	        this.quality = quality;
	    }

	    Rice(String quality, double price) {
	        this.quality = quality;
	        this.price = price;
	    }

	    Rice(int quantity, double weight) {
	        this.quantity = quantity;
	        this.weight = weight;
	    }

	    Rice(double weight, int quantity) {
	        this.weight = weight;
	        this.quantity = quantity;
	    }

	    Rice(String variety, int quantity, String origin) {
	        this.variety = variety;
	        this.quantity = quantity;
	        this.origin = origin;
	    }

	    Rice(String color, String origin, double weight) {
	        this.color = color;
	        this.origin = origin;
	        this.weight = weight;
	    }

	    Rice(int quantity, double price, double weight) {
	        this.quantity = quantity;
	        this.price = price;
	        this.weight = weight;
	    }

	    Rice(String variety, String quality, double price, int quantity) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    Rice(String variety, double price, String origin, String color) {

	        this.variety = variety;
	        this.price = price;
	        this.origin = origin;
	        this.color = color;
	    }

	    Rice(String variety, String quality, double price, int quantity, String origin) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	        this.origin = origin;
	    }

	    Rice(String variety, double price, int quantity, String color, String origin) {

	        this.variety = variety;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.origin = origin;
	    }

	    Rice(String variety, String quality, double price, int quantity, String color, String origin) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.origin = origin;
	    }

	    Rice(String variety, String quality, double price, int quantity, String color, String origin, double weight) {

	        this.variety = variety;
	        this.quality = quality;
	        this.price = price;
	        this.quantity = quantity;
	        this.color = color;
	        this.origin = origin;
	        this.weight = weight;
	    }


	    public String toString() {

	        return "Variety is: " +variety+ "\nQuality is: " + quality + "\nPrice is: " + price + "\nQuantity is: " + quantity + "\nColor is: " + color + "\nOrigin is: " + origin + "\nWeight is: " + weight + "\n==============================";
	    }
	

}
