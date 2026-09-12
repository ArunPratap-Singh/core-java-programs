package projects.FastFood;

public class Pizza extends FastFood{
	
	    String brandname;
	    String size;
	    String topping;

	    Pizza() {

	    }

	    Pizza(String name, double price, int quantity, String brandname, String size, String topping) {

	        super(name, price, quantity);
	        this.brandname = brandname;
	        this.size = size;
	        this.topping = topping;
	    }
	

}
