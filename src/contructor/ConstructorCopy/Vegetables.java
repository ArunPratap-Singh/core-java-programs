package contructor.ConstructorCopy;

public class Vegetables {

	    String name;
	    String type;
	    double price;

	    Vegetables() {
	    }

	    Vegetables(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Vegetables(Vegetables v){
	    	
	    	this.name = v.name;
	    	this.price = v.price;
	    	this.type = v.type;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
