package projects.Footwear;

public class FlipFlops extends Footwear{
	
	    String brandname;
	    String color;
	    String material;

	    FlipFlops() {

	    }

	    FlipFlops(String name, double price, int size, String brandname, String color, String material) {

	        super(name, price, size);

	        this.brandname = brandname;
	        this.color = color;
	        this.material = material;
	    }
	

}
