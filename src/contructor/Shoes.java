package contructor;

public class Shoes {

	    String brand;
	    String type;
	    double price;

	    Shoes() {
	    }

	    Shoes(String brand, String type, double price) {
	        this.brand = brand;
	        this.type = type;
	        this.price = price;
	    }

	    public String toString() {
	        return "Brand is: " +brand+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
