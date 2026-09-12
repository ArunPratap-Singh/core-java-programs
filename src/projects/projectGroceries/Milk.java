package projects.projectGroceries;

public class Milk extends Grocery{
	
	    String brandname;
	    String milktype;
	    double liters;

	    Milk() {

	    }

	    Milk(String name, double price, int quantity, String brandname, String milktype, double liters) {

	        super(name, price, quantity);

	        this.brandname = brandname;
	        this.milktype = milktype;
	        this.liters = liters;
	    }
	

}
