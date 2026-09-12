package projects.projectGroceries;

public class Oil extends Grocery{
	
	    String brandname;
	    String oiltype;
	    double liters;

	    Oil() {

	    }

	    Oil(String name, double price, int quantity, String brandname, String oiltype, double liters) {

	        super(name, price, quantity);

	        this.brandname = brandname;
	        this.oiltype = oiltype;
	        this.liters = liters;
	    }
	

}
