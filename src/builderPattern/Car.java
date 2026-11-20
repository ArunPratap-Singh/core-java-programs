package builderPattern;

public class Car {
	
	private String brand;
    private String model;
    private double price;
    private String color;
    private int manufacturingYear;
    private String fuelType;
    
    private Car(){
    	
    }
    
   private Car(String brand, String model, double price, String color, int manufacturingYear, String fuelType){
    	
    	this.brand = brand;
    	this.model = model;
    	this.price = price;
    	this.color = color;
    	this.manufacturingYear = manufacturingYear;
    	this.fuelType = fuelType;
    }
   
   @Override
   public String toString() {
	   
	   return "Car [Brand is: " +brand+ ", Model is: " +model+ ", Price is: " +price+ ", Color is: " +color+ ", ManufacturingYear is: " +manufacturingYear+ ", FuelType is: " +fuelType+ "]";
   }
    
   private Car(Builder b){
    	
    	this(b.brand, b.model, b.price, b.color, b.manufacturingYear, b.fuelType);
    }
    
    static class Builder{
    	
    	private String brand;
        private String model;
        private double price;
        private String color;
        private int manufacturingYear;
        private String fuelType;
        
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

        public Builder setManufacturingYear(int manufacturingYear) {
            
        	this.manufacturingYear = manufacturingYear;
            return this;
        }

        public Builder setFuelType(String fuelType) {
            
        	this.fuelType = fuelType;
            return this;
        }
        
        public Car build() {
        	
        	return new Car(this);
        }
    }

}
