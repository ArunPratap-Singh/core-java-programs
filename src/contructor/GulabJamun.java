package contructor;

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

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
