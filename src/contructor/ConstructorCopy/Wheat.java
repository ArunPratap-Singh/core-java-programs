package contructor.ConstructorCopy;

public class Wheat {

	    String name;
	    String type;
	    double price;

	    Wheat() {
	    }

	    Wheat(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Wheat(Wheat w){
	    
	    	this.name = w.name;
	    	this.price = w.price;
	    	this.type = w.type;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
