package contructor;

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

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
