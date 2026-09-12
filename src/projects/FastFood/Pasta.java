package projects.FastFood;

public class Pasta extends FastFood{
	
	    String pastaType;
	    String sauceType;
	    String cheeseType;

	    Pasta() {

	    }

	    Pasta(String name, double price, int quantity, String pastaType, String sauceType, String cheeseType) {

	        super(name, price, quantity);

	        this.pastaType = pastaType;
	        this.sauceType = sauceType;
	        this.cheeseType = cheeseType;
	    }
	

}
