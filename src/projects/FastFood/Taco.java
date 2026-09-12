package projects.FastFood;

public class Taco extends FastFood{
	
	    String shellType;
	    String filling;
	    boolean isSpicy;

	    Taco() {

	    }

	    Taco(String name, double price, int quantity, String shellType, String filling, boolean isSpicy) {

	        super(name, price, quantity);
	        this.shellType = shellType;
	        this.filling = filling;
	        this.isSpicy = isSpicy;
	    }
	

}
