package contructor.ConstructorCopy;

public class Dishes {

	    String name;
	    String type;
	    double price;

	    Dishes() {
	    }

	    Dishes(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Dishes(Dishes d){
	    	
	    	this.name = d.name;
	    	this.type = d.type;
	    	this.price = d.price;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
