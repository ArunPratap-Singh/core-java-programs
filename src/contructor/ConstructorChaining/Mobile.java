package contructor.ConstructorChaining;

public class Mobile {
	
	    String brand;
	    String model;
	    String processor;
	    int ram;
	    double price;
	    String storage;
	    String color;
	    int battery;

	    Mobile(String brand, String model, String processor, int ram, double price, String storage, String color, int battery) {

	        this.brand = brand;
	        this.model = model;
	        this.processor = processor;
	        this.ram = ram;
	        this.price = price;
	        this.storage = storage;
	        this.color = color;
	        this.battery = battery;
	    }

	    Mobile() {
	    }

	    Mobile(String brand) {
	        this.brand = brand;
	    }

	    Mobile(String brand, String model) {
	        this(brand);
	        this.model = model;
	    }

	    Mobile(String brand, String model, String processor) {
	        this(brand, model);
	        this.processor = processor;
	    }

	    Mobile(String brand, String model, String processor, int ram) {
	        this(brand, model, processor);
	        this.ram = ram;
	    }

	    Mobile(String brand, String model, String processor, int ram, double price) {
	        this(brand, model, processor, ram);
	        this.price = price;
	    }

	    Mobile(String brand, String model, String processor, int ram, double price, String storage) {
	        this(brand, model, processor, ram, price);
	        this.storage = storage;
	    }

	    Mobile(String brand, String model, String processor, int ram, double price, String storage, String color) {
	        this(brand, model, processor, ram, price, storage);
	        this.color = color;
	    }

	    Mobile(int ram, String brand, String model, String processor, double price, String storage, String color, int battery) {
	        this(brand, model, processor, ram, price, storage, color);
	        this.battery = battery;
	    }

	    public String toString() {
	        return "Brand is: " + brand + "\tModel is: " + model + "\tProcessor is: " + processor + "\nRAM is: " + ram + "\tPrice is: " + price + "\tStorage is: " + storage + "\nColor is: " + color + "\tBattery is: " + battery + " mAh" + "\n===============================================";
	    }
	

}
