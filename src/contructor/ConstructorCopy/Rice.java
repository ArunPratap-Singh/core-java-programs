package contructor.ConstructorCopy;

public class Rice {

	    String name;
	    String type;
	    double price;

	    Rice() {
	    }

	    Rice(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Rice(Rice r){
	    	
	    	this.name = r.name;
	    	this.price = r.price;
	    	this.type = r.type;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
