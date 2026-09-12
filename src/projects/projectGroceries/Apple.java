package projects.projectGroceries;

public class Apple extends Grocery{
	
	    String variety;
	    String color;
	    String origin;

	    Apple() {

	    }

	    Apple(String name, double price, int quantity, String variety, String color, String origin) {

	        super(name, price, quantity);
	        this.variety = variety;
	        this.color = color;
	        this.origin = origin;
	    }
	

}
