package projects.Footwear;

public class Shoes extends Footwear{

	    String brandname;
	    String color;
	    String material;

	    Shoes() {

	    }

	    Shoes(String name, double price, int size, String brandname, String color, String material) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.color = color;
	        this.material = material;
	    }
	

}
