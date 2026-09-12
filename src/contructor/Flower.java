package contructor;

public class Flower {
	
	    String name;
	    String color;
	    double price;

	    Flower() {
	    }

	    Flower(String name, String color, double price) {
	        this.name = name;
	        this.color = color;
	        this.price = price;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nColor is: " +color+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
