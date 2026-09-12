package projects.FastFood;

public class Sandwich extends FastFood{
	
	    String breadType;
	    String filling;
	    boolean isGrilled;

	    Sandwich() {

	    }

	    Sandwich(String name, double price, int quantity, String breadType, String filling, boolean isGrilled) {

	        super(name, price, quantity);
	        this.breadType = breadType;
	        this.filling = filling;
	        this.isGrilled = isGrilled;
	    }
	

}
