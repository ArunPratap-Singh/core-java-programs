package contructor;

public class Car {
	
	String brand;
    String model;
    double price;
    
    Car() {
    	
    }

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public String toString() {
    	
    	return "Brand is: " +brand+"\nModel is: " +model+"\nPrice is: " +price+"\n=========================";
    }

}
