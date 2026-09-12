package projects.FastFood;

public class Noodles extends FastFood{
	
	    String noodleType;
	    String spiceLevel;
	    boolean isVeg;

	    Noodles() {

	    }

	    Noodles(String name, double price, int quantity, String noodleType, String spiceLevel, boolean isVeg) {

	        super(name, price, quantity);

	        this.noodleType = noodleType;
	        this.spiceLevel = spiceLevel;
	        this.isVeg = isVeg;
	    }
	

}
