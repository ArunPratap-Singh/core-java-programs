package projects.projectGroceries;

public class Wheat extends Grocery{
	
	    String brandname;
	    String quality;
	    double weight;

	    Wheat() {

	    }

	    Wheat(String name, double price, int quantity, String brandname, String quality, double weight) {

	        super(name, price, quantity);

	        this.brandname = brandname;
	        this.quality = quality;
	        this.weight = weight;
	    }
	

}
