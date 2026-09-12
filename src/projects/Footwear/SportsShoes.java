package projects.Footwear;

public class SportsShoes extends Footwear{
	
	    String brandname;
	    String sportType;
	    boolean isLightWeight;

	    SportsShoes() {

	    }

	    SportsShoes(String name, double price, int size, String brandname, String sportType, boolean isLightWeight) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.sportType = sportType;
	        this.isLightWeight = isLightWeight;
	    }
	

}
