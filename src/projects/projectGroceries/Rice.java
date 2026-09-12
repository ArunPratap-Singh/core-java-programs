package projects.projectGroceries;

public class Rice extends Grocery{
	
	    String brandname;
	    String type;
	    double weight;

	    Rice() {

	    }

	    Rice(String name, double price, int quantity, String brandname, String type, double weight) {

	        super(name, price, quantity);
	        this.brandname = brandname;
	        this.type = type;
	        this.weight = weight;
	    }
	

}
