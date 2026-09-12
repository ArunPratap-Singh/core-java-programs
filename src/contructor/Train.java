package contructor;

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

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
