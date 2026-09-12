package projects.Footwear;

public class Sneakers extends Footwear{
	
	    String brandname;
	    String color;
	    boolean isLace;

	    Sneakers() {

	    }

	    Sneakers(String name, double price, int size, String brandname, String color, boolean isLace) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.color = color;
	        this.isLace = isLace;
	    }
	

}
