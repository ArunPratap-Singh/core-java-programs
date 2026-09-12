package projects.Footwear;

public class Slippers extends Footwear{
	
	    String brandname;
	    String material;
	    boolean isSoft;

	    Slippers() {

	    }

	    Slippers(String name, double price, int size, String brandname, String material, boolean isSoft) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.material = material;
	        this.isSoft = isSoft;
	    }
	

}
