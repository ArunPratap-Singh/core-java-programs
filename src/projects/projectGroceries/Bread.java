package projects.projectGroceries;

public class Bread extends Grocery{
	
	    String brandname;
	    String breadtype;
	    int slices;

	    Bread() {

	    }

	    Bread(String name, double price, int quantity, String brandname, String breadtype, int slices) {

	        super(name, price, quantity);

	        this.brandname = brandname;
	        this.breadtype = breadtype;
	        this.slices = slices;
	    }
	

}
