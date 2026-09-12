package inheritancePrograming.Fruit;

public class Fruit {
	
	    String name;
	    String color;
	    double price;
	    String taste;
	    int quantity;
	    
	    Fruit(){
	    	
	    }

	    public Fruit(String name, String color, double price, String taste, int quantity) {

	        this.name = name;
	        this.color = color;
	        this.price = price;
	        this.taste = taste;
	        this.quantity = quantity;
	    }

	    public String toString() {
	    	return "Name is: " +name+"\nColor is: " +color+"\nPrice is: " +price+"\nTaste is: " +taste+"\tQuantity is: " +quantity+"\n==========================";
	}

}
