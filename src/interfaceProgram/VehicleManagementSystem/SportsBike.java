package interfaceProgram.VehicleManagementSystem;


public class SportsBike implements TwoWheeler {

    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufacturingYear;
    private double price;
    private double fuel;
    private double distance;
    private double speed;
    
    SportsBike(){
    	
    }
    
    SportsBike(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price, double fuel, double speed, double distance){
    	
    	this.brand = brand;
    	this.model = model;
    	this.registrationNumber = registrationNumber;
    	this.color = color;
    	this.manufacturingYear = manufacturingYear;
    	this.price = price;
    	this.fuel = fuel;
    	this.distance = distance;
    	this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println("Sports bike engine started.");
    }

    @Override
    public void stop() {
    	speed = 0;
        System.out.println("Sports bike stopped.");
    }

    @Override
    public void brake() {
    	speed = Math.max(0, speed -10);
        System.out.println("Sports bike disc brakes applied.");
    }

    @Override
    public void accelerate() {
    	speed+=10;
        System.out.println("Sports bike accelerating rapidly.");
    }

    @Override
    public double fuelUsed(double distance) {
        return distance / mileage();
    }

    @Override
    public double mileage() {
        return distance/fuel;
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public void wearHelmet() {
        System.out.println("Wear an approved riding helmet.");
    }

    
   	@Override
	public void kickStart() {
   		System.out.println("Sports Bike Kick-start activated");
		
	}

	@Override
	public void balance() {
		System.out.println("Sports Bike Balancing Operation");
		
	}
	
	@Override
    public String toString() {
        return "SportsBike [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: " + registrationNumber
                + ", Color is: " + color + ", Year is: " + manufacturingYear
                + ", Price is: " + price + ", Fuel is: " + fuel
                + ", Speed=" + speed + ", Distance is: " +distance+"Km]";
	}    
}
