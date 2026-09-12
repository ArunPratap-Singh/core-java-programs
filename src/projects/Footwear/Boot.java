package projects.Footwear;

public class Boot extends Footwear{
	
	    String brandname;
	    String bootType;
	    boolean isWaterproof;

	    Boot() {

	    }

	    Boot(String name, double price, int size, String brandname, String bootType, boolean isWaterproof) {

	        super(name, price, size);

	        this.brandname = brandname;
	        this.bootType = bootType;
	        this.isWaterproof = isWaterproof;
	    }
	

}
