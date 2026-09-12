package contructor;

public class Animals {
	
	    String name;
	    String type;
	    double price;

	    Animals() {
	    }

	    Animals(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
