package projects.projectGroceries;

public class Potato extends Grocery{
	
	    String variety;
	    String quality;
	    boolean isFresh;

	    Potato() {

	    }

	    Potato(String name, double price, int quantity, String variety, String quality, boolean isFresh) {

	        super(name, price, quantity);

	        this.variety = variety;
	        this.quality = quality;
	        this.isFresh = isFresh;
	    }
	

}
