package projects.FastFood;

public class GarlicBread extends FastFood{
	
	    String breadType;
	    String cheeseType;
	    int pieces;

	    GarlicBread() {

	    }

	    GarlicBread(String name, double price, int quantity, String breadType, String cheeseType, int pieces) {

	        super(name, price, quantity);

	        this.breadType = breadType;
	        this.cheeseType = cheeseType;
	        this.pieces = pieces;
	    }
	

}
