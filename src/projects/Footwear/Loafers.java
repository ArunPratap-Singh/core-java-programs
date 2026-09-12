package projects.Footwear;

public class Loafers extends Footwear{
	
	    String brandname;
	    String color;
	    String leatherType;

	    Loafers() {

	    }

	    Loafers(String name, double price, int size, String brandname, String color, String leatherType) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.color = color;
	        this.leatherType = leatherType;
	    }
	

}
