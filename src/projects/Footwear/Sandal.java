package projects.Footwear;

public class Sandal extends Footwear{
	
	    String brandname;
	    String material;
	    String color;

	    Sandal() {

	    }

	    Sandal(String name, double price, int size,  String brandname, String material, String color) {

	        super(name, price, size);
	        this.brandname = brandname;
	        this.material = material;
	        this.color = color;
	    }
	

}
