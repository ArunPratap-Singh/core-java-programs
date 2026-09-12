package contructor.ConstructorCopy;

public class Television {

	    String brand;
	    String type;
	    double price;

	    Television() {
	    }

	    Television(String brand, String type, double price) {
	        this.brand = brand;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Television(Television t){
	    	
	    	this.brand = t.brand;
	    	this.price = t.price;
	    	this.type = t.type;
	    }

	    public String toString() {
	        return "Brand is: " +brand+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
