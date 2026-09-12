package contructor.ConstructorOverloading;

public class Laptop {
	
	    String brand;
	    String model;
	    double price;
	    int ram;
	    int storage;
	    String processor;
	    String color;

	    Laptop() {
	    	
	    }

	    Laptop(String brand) {
	        this.brand = brand;
	    }

	    
	    Laptop(int ram) {
	        this.ram = ram;
	    }

	    
	    Laptop(double price) {
	        this.price = price;
	    }

	    
	    Laptop(long storage) {
	        this.storage = (int) storage;
	    }

	  
	    Laptop(int ram, String brand) {
	        this.ram = ram;
	        this.brand = brand;
	    }

	    
	    Laptop(String brand, int ram) {
	        this.brand = brand;
	        this.ram = ram;
	    }

	    
	    Laptop(double price, String model) {
	        this.price = price;
	        this.model = model;
	    }

	    
	    Laptop(String model, double price) {
	        this.model = model;
	        this.price = price;
	    }

	
	    Laptop(int ram, double price) {
	        this.ram = ram;
	        this.price = price;
	    }

	    
	    Laptop(double price, int ram) {
	        this.price = price;
	        this.ram = ram;
	    }


	    Laptop(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }

	    Laptop(String brand, int ram, int storage) {
	        this.brand = brand;
	        this.ram = ram;
	        this.storage = storage;
	    }

	    Laptop(String brand, String model, String processor) {
	        this.brand = brand;
	        this.model = model;
	        this.processor = processor;
	    }

	    Laptop(String brand, double price, String color, int ram) {
	        this.brand = brand;
	        this.price = price;
	        this.color = color;
	        this.ram = ram;
	    }

	    Laptop(String brand, String model, double price, int ram, int storage) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	        this.ram = ram;
	        this.storage = storage;
	    }

	   
	    Laptop(String brand, String model, double price, int ram, int storage, String processor) {

	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	        this.ram = ram;
	        this.storage = storage;
	        this.processor = processor;
	    }

	    
	    Laptop(String brand, String model, double price, int ram, int storage, String processor, String color) {

	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	        this.ram = ram;
	        this.storage = storage;
	        this.processor = processor;
	        this.color = color;
	    }

	    public String toString() {

	        return "Brand is: " + brand + "\nModel is: " + model + "\nPrice is: " + price + "\nRAM is: " + ram + " GB" + "\nStorage is: " + storage + " GB" + "\nProcessor is: " + processor + "\nColor is: " + color + "\n==============================";
	    }
	

}
