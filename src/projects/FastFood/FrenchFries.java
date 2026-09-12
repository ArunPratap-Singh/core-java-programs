package projects.FastFood;

public class FrenchFries extends FastFood{
	
	    String size;
	    String seasoning;
	    boolean isCheesy;

	    FrenchFries() {

	    }

	    FrenchFries(String name, double price, int quantity, String size, String seasoning, boolean isCheesy) {

	        super(name, price, quantity);

	        this.size = size;
	        this.seasoning = seasoning;
	        this.isCheesy = isCheesy;
	    }
	

}
