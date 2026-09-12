package contructor.ConstructorCopy;

public class Mobile {
	
	String brand;
    double price;
    String storage;
    
    Mobile() {
    	
    }

    Mobile(String brand, double price, String storage) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }
    
    Mobile(Mobile m){
    	
    	this.brand = m.brand;
    	this.price = m.price;
    	this.storage = m.storage;
    }
    
    public String toString() {
    	
    	return "Brand is: " +brand+"\nPrice is: " +price+"\nStorage is: " +storage+"\n================================";
    }

}
