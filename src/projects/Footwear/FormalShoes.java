package projects.Footwear;

public class FormalShoes extends Footwear{
	
	    String brandname;
	    String color;
	    String material;

	    FormalShoes() {

	    }

	    FormalShoes(String name, double price, int size, String brandname, String color, String material) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.color = color;
	        this.material = material;
	    }
	

}
