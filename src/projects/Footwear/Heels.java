package projects.Footwear;

public class Heels extends Footwear{
	
	    String brandname;
	    double heelHeight;
	    String color;

	    Heels() {

	    }

	    Heels(String name, double price, int size, String brandname, double heelHeight, String color) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.heelHeight = heelHeight;
	        this.color = color;
	    }
	

}
