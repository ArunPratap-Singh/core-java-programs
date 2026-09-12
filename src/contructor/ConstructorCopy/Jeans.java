package contructor.ConstructorCopy;

public class Jeans {

	    String brand;
	    String type;
	    double price;

	    Jeans() {
	    }

	    Jeans(String brand, String type, double price) {
	        this.brand = brand;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Jeans(Jeans j){
	    	
	    	this.brand = j.brand;
	    	this.price = j.price;
	    	this.type = j.type;
	    }

	    public String toString() {
	        return "Brand is: " +brand+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
