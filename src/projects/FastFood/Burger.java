package projects.FastFood;

public class Burger extends FastFood{
	
	    String brandname;
	    String burgerType;
	    boolean isVeg;

	    Burger() {

	    }

	    Burger(String name, double price, int quantity, String brandname, String burgerType, boolean isVeg) {

	        super(name, price, quantity);
	        this.brandname = brandname;
	        this.burgerType = burgerType;
	        this.isVeg = isVeg;
	    }
	

}
