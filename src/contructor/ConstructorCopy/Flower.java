package contructor.ConstructorCopy;

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
	    
	    Flower(Flower f){
	    	
	    	this.name = f.name;
	    	this.color = f.color;
	    	this.price = f.price;
	    }

	    public String toString() {
	        return "Name is: " +name+ "\nColor is: " +color+ "\nPrice is: " +price+ "\n==============================";
	    }
	

}
