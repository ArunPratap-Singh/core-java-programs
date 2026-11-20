package builderPattern;

public class Vehicle {

	    private int vehicleId;
	    private String brand;
	    private String model;
	    private String vehicleType;
	    private double price;
	    private String color;
	    private int manufacturingYear;
	    private String fuelType;

	    private Vehicle() {

	    }

	    private Vehicle(int vehicleId, String brand, String model, String vehicleType, double price, String color, int manufacturingYear, String fuelType) {

	        this.vehicleId = vehicleId;
	        this.brand = brand;
	        this.model = model;
	        this.vehicleType = vehicleType;
	        this.price = price;
	        this.color = color;
	        this.manufacturingYear = manufacturingYear;
	        this.fuelType = fuelType;
	    }

	    private Vehicle(Builder b) {
	        
	    	this(b.vehicleId, b.brand, b.model, b.vehicleType, b.price, b.color, b.manufacturingYear, b.fuelType);
	    }

	    @Override
	    public String toString() {
	        
	    	return "Vehicle [Vehicle ID is: " + vehicleId + ", Brand is: " + brand + ", Model is: " + model + ", Vehicle Type is: " + vehicleType + ", Price is: " + price + ", Color is: " + color + ", Manufacturing Year is: " + manufacturingYear + ", Fuel Type is: " + fuelType + "]";
	    }

	    static class Builder {

	        private int vehicleId;
	        private String brand;
	        private String model;
	        private String vehicleType;
	        private double price;
	        private String color;
	        private int manufacturingYear;
	        private String fuelType;

	        public Builder setVehicleId(int vehicleId) {
	            
	        	this.vehicleId = vehicleId;
	            return this;
	        }

	        public Builder setBrand(String brand) {
	            
	        	this.brand = brand;
	            return this;
	        }

	        public Builder setModel(String model) {
	            
	        	this.model = model;
	            return this;
	        }

	        public Builder setVehicleType(String vehicleType) {
	            
	        	this.vehicleType = vehicleType;
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

	        public Builder setManufacturingYear(int manufacturingYear) {
	            
	        	this.manufacturingYear = manufacturingYear;
	            return this;
	        }

	        public Builder setFuelType(String fuelType) {
	            
	        	this.fuelType = fuelType;
	            return this;
	        }

	        public Vehicle build() {
	            
	        	return new Vehicle(this);
	        }
	    }
	}

