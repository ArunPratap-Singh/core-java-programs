package contructor.ConstructorCopy;

public class Furniture {

	    String name;
	    String type;
	    double price;

	    Furniture() {
	    }

	    Furniture(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Furniture(Furniture f){
	    	
	    	this.name = f.name;
	    	this.price = f.price;
	    	this.type = f.type;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
