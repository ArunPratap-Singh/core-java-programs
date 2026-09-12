package projects.FastFood;

public class Wrap extends FastFood{
	
	    String wrapType;
	    String filling;
	    String sauce;

	    Wrap() {

	    }

	    Wrap(String name, double price, int quantity, String wrapType, String filling, String sauce) {

	        super(name, price, quantity);
	        this.wrapType = wrapType;
	        this.filling = filling;
	        this.sauce = sauce;
	    }
	

}
