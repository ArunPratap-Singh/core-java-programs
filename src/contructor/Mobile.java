package contructor;

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
    
    public String toString() {
    	
    	return "Brand is: " +brand+"\nPrice is: " +price+"\nStorage is: " +storage+"\n================================";
    }

}
