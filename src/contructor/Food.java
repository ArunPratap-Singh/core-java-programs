package contructor;

public class Food {

	    String name;
	    String type;
	    double price;

	    Food() {
	    }

	    Food(String name, String type, double price) {
	        this.name = name;
	        this.type = type;
	        this.price = price;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nType is: " +type+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
