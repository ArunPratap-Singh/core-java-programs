package projects.projectGroceries;

public class Eggs extends Grocery{
	
	    String brandname;
	    String eggtype;
	    int totalEggs;

	    Eggs() {

	    }

	    Eggs(String name, double price, int quantity, String brandname, String eggtype, int totalEggs) {

	        super(name, price, quantity);
	        this.brandname = brandname;
	        this.eggtype = eggtype;
	        this.totalEggs = totalEggs;
	    }
	

}
