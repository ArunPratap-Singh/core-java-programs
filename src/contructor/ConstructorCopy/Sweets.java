package contructor.ConstructorCopy;

public class Sweets {

	    String name;
	    String type;
	    double price;

	    Sweets() {
	    }

	    Sweets(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Sweets(Sweets s){
	    	
	    	this.name = s.name;
	    	this.price = s.price;
	    	this.type = s.type;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
