package methodChaining;

public class Car {
	
	    private String brand;
	    private String model;
	    private String color;
	    private int price;
	    private int year;
	    
	    Car(){
	    	
	    }

	    //Setter Method
	    public Car setBrand(String brand) {
	        this.brand = brand;
	        return this;
	    }

	    public Car setModel(String model) {
	        this.model = model;
	        return this;
	    }

	    public Car setColor(String color) {
	        this.color = color;
	        return this;
	    }

	    public Car setPrice(int price) {
	        this.price = price;
	        return this;
	    }

	    public Car setYear(int year) {
	        this.year = year;
	        return this;
	    }

	    // Getter methods
	    public Car printBrand() {
	    	System.out.println("Brand is: " +brand);
	        return this;
	    }

	    public Car printModel() {
	    	System.out.println("Model is: " +model);
	        return this;
	    }

	    public Car printColor() {
	    	System.out.println("Color is: " +color);
	        return this;
	    }

	    public Car printPrice() {
	    	System.out.println("Price is: " +price);
	        return this;
	    }

	    public Car printYear() {
	    	System.out.println("Year is: " +year);
	        return this;
	    }
	

}
