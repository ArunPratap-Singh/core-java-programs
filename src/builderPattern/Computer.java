package builderPattern;

public class Computer {

	    private int computerId;
	    private String brand;
	    private String processor;
	    private int ram;
	    private int storage;
	    private String operatingSystem;
	    private double price;
	    private String color;

	    private Computer() {

	    }

	    private Computer(int computerId, String brand, String processor, int ram, int storage, String operatingSystem, double price, String color) {

	        this.computerId = computerId;
	        this.brand = brand;
	        this.processor = processor;
	        this.ram = ram;
	        this.storage = storage;
	        this.operatingSystem = operatingSystem;
	        this.price = price;
	        this.color = color;
	    }

	    private Computer(Builder b) {
	        
	    	this(b.computerId, b.brand, b.processor, b.ram, b.storage, b.operatingSystem, b.price, b.color);
	    }

	    @Override
	    public String toString() {
	        
	    	return "Computer [Computer ID is: " + computerId + ", Brand is: " + brand + ", Processor is: " + processor + ", RAM is: " + ram + " GB" + ", Storage is: " + storage + " GB" + ", Operating System is: " + operatingSystem + ", Price is: " + price + ", Color is: " + color + "]";
	    }

	    static class Builder {

	        private int computerId;
	        private String brand;
	        private String processor;
	        private int ram;
	        private int storage;
	        private String operatingSystem;
	        private double price;
	        private String color;

	        public Builder setComputerId(int computerId) {
	            
	        	this.computerId = computerId;
	            return this;
	        }

	        public Builder setBrand(String brand) {
	            
	        	this.brand = brand;
	            return this;
	        }

	        public Builder setProcessor(String processor) {
	            
	        	this.processor = processor;
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

	        public Builder setOperatingSystem(String operatingSystem) {
	            
	        	this.operatingSystem = operatingSystem;
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

	        public Computer build() {
	           
	        	return new Computer(this);
	        }
	    }
	}


