package contructor.ConstructorCopy;

public class GulabJamun {

	    String name;
	    String type;
	    double price;

	    GulabJamun() {
	    }

	    GulabJamun(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }
	    
	    GulabJamun(GulabJamun g){
	    	
	    	this.name = g.name;
	    	this.type = g.type;
	    	this.price = g.price;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
