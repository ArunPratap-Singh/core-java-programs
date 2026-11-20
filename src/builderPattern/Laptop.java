package builderPattern;

public class Laptop {

    private String brand;
    private String model;
    private double price;
    private String color;
    private int ram;
    private int storage;

    private Laptop() {
    	
    }

    private Laptop(String brand, String model, double price, String color, int ram, int storage) {
        
    	this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
    }

    private Laptop(Builder b) {
        
    	this(b.brand, b.model, b.price, b.color, b.ram, b.storage);
    }

    @Override
    public String toString() {
        
    	return "Laptop [Brand is: " + brand + ", Model is: " + model + ", Price is: " + price + ", Color is: " + color + ", RAM is: " + ram + "GB, Storage is: " + storage + "GB]";
    }

    static class Builder {

        private String brand;
        private String model;
        private double price;
        private String color;
        private int ram;
        private int storage;

        public Builder setBrand(String brand) {
            
        	this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            
        	this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
           
        	this.price = price;
            return this;
        }

        public Builder setColor(String color) {
            
        	this.color = color;
            return this;
        }

        public Builder setRam(int ram) {
            
        	this.ram = ram;
            return this;
        }

        public Builder setStorage(int storage) {
            
        	this.storage = storage;
            return this;
        }

        public Laptop build() {
            
        	return new Laptop(this);
        }
    }
}


