package contructor.ConstructorChaining;

public class Laptop {
	
	    String brand;
	    String model;
	    String processor;
	    int ram;
	    double price;
	    String storage;
	    String color;
	    int warranty;

	    Laptop(String brand, String model, String processor, int ram, double price, String storage, String color, int warranty) {

	        this.brand = brand;
	        this.model = model;
	        this.processor = processor;
	        this.ram = ram;
	        this.price = price;
	        this.storage = storage;
	        this.color = color;
	        this.warranty = warranty;
	    }

	    Laptop() {
	    }

	    Laptop(String brand) {
	        this.brand = brand;
	    }

	    Laptop(String brand, String model) {
	        this(brand);
	        this.model = model;
	    }

	    Laptop(String brand, String model, String processor) {
	        this(brand, model);
	        this.processor = processor;
	    }

	    Laptop(String brand, String model, String processor, int ram) {
	        this(brand, model, processor);
	        this.ram = ram;
	    }

	    Laptop(String brand, String model, String processor, int ram, double price) {
	        this(brand, model, processor, ram);
	        this.price = price;
	    }

	    Laptop(String brand, String model, String processor, int ram, double price, String storage) {
	        this(brand, model, processor, ram, price);
	        this.storage = storage;
	    }

	    Laptop(String brand, String model, String processor, int ram, double price, String storage, String color) {
	        this(brand, model, processor, ram, price, storage);
	        this.color = color;
	    }

	    Laptop(int ram, String brand, String model, String processor, double price, String storage, String color, int warranty) {

	        this(brand, model, processor, ram, price, storage, color);
	        this.warranty = warranty;
	    }

	    public String toString() {

	        return "Brand is: " + brand + "\tModel is: " + model + "\tProcessor is: " + processor + "\tRAM is: " + ram + " GB" + "\nPrice is: " + price + "\tStorage is: " + storage + "\tColor is: " + color + "\tWarranty is: " + warranty + " Years"  + "\n===============================================";
	    }
	

}
