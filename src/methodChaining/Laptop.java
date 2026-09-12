package methodChaining;

public class Laptop {
	
	    private String brand;
	    private String model;
	    private String color;
	    private int price;
	    private int ram;
	    private int storage;

	    // Setter methods

	    public Laptop setBrand(String brand) {
	        this.brand = brand;
	        return this;
	    }

	    public Laptop setModel(String model) {
	        this.model = model;
	        return this;
	    }

	    public Laptop setColor(String color) {
	        this.color = color;
	        return this;
	    }

	    public Laptop setPrice(int price) {
	        this.price = price;
	        return this;
	    }

	    public Laptop setRam(int ram) {
	        this.ram = ram;
	        return this;
	    }

	    public Laptop setStorage(int storage) {
	        this.storage = storage;
	        return this;
	    }

	    // Print methods

	    public Laptop printBrand() {
	        System.out.println("Brand: " + brand);
	        return this;
	    }

	    public Laptop printModel() {
	        System.out.println("Model: " + model);
	        return this;
	    }

	    public Laptop printColor() {
	        System.out.println("Color: " + color);
	        return this;
	    }

	    public Laptop printPrice() {
	        System.out.println("Price: " + price);
	        return this;
	    }

	    public Laptop printRam() {
	        System.out.println("RAM: " + ram + " GB");
	        return this;
	    }

	    public Laptop printStorage() {
	        System.out.println("Storage: " + storage + " GB");
	        return this;
	    }
	

}
