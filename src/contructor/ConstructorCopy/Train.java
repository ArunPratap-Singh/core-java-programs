package contructor.ConstructorCopy;

public class Train {

	    String name;
	    String type;
	    double price;

	    Train() {
	    }

	    Train(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    Train(Train t){
	    	
	    	this.name = t.name;
	    	this.price = t.price;
	    	this.type = t.type;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
