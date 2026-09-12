package contructor;

public class Television {

	    String brand;
	    String type;
	    double price;

	    Television() {
	    }

	    Television(String brand, String type, double price) {
	        this.brand = brand;
	        this.type = type;
	        this.price = price;
	    }

	    public String toString() {
	        return "Brand is: " +brand+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
