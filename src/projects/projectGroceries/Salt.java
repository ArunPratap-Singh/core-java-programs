package projects.projectGroceries;

public class Salt extends Grocery{
	
	    String brandname;
	    String type;
	    boolean isIodized;

	    Salt() {

	    }

	    Salt(String name, double price, int quantity, String brandname, String type, boolean isIodized) {

	        super(name, price, quantity);

	        this.brandname = brandname;
	        this.type = type;
	        this.isIodized = isIodized;
	    }
	

}
