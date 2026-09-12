package methodChaining;

public class MobilePhone {
	
	    private String brand;
	    private String model;
	    private String color;
	    private int price;
	    private int storage;
	    private int ram;

	   //Setters
	    public MobilePhone setBrand(String brand) {
	        this.brand = brand;
	        return this;
	    }

	    public MobilePhone setModel(String model) {
	        this.model = model;
	        return this;
	    }

	    public MobilePhone setColor(String color) {
	        this.color = color;
	        return this;
	    }

	    public MobilePhone setPrice(int price) {
	        this.price = price;
	        return this;
	    }

	    public MobilePhone setStorage(int storage) {
	        this.storage = storage;
	        return this;
	    }

	    public MobilePhone setRam(int ram) {
	        this.ram = ram;
	        return this;
	    }

	    //Getters

	    public MobilePhone printBrand() {
	        System.out.println("Brand: " + brand);
	        return this;
	    }

	    public MobilePhone printModel() {
	        System.out.println("Model: " + model);
	        return this;
	    }

	    public MobilePhone printColor() {
	        System.out.println("Color: " + color);
	        return this;
	    }

	    public MobilePhone printPrice() {
	        System.out.println("Price: " + price);
	        return this;
	    }

	    public MobilePhone printStorage() {
	        System.out.println("Storage: " + storage + " GB");
	        return this;
	    }

	    public MobilePhone printRam() {
	        System.out.println("RAM: " + ram + " GB");
	        return this;
	    }
	

}
