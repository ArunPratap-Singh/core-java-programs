package projects.projectGroceries;

public class Sugar extends Grocery{
	
	    String brandname;
	    String type;
	    boolean isRefined;

	    Sugar() {

	    }

	    Sugar(String name, double price, int quantity, String brandname, String type, boolean isRefined) {

	        super(name, price, quantity);

	        this.brandname = brandname;
	        this.type = type;
	        this.isRefined = isRefined;
	    }
	

}
