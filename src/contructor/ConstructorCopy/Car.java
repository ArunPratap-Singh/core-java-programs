package contructor.ConstructorCopy;

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
    
    Car(Car c){
    	
    	this.brand = c.brand;
    	this.model = c.model;
    	this.price = c.price;
    }
    
    public String toString() {
    	
    	return "Brand is: " +brand+"\nModel is: " +model+"\nPrice is: " +price+"\n=========================";
    }

}
