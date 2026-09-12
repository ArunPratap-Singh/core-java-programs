package contructor.ConstructorCopy;

public class Airlines {

	    String name;
	    String type;
	    double price;

	    Airlines() {
	    }

	    Airlines(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Airlines(Airlines a) {
	    	
	    	this.name = a.name;
	    	this.price = a.price;
	    	this.type = a.type;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
