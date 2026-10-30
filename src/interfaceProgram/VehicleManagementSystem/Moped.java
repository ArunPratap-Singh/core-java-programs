package interfaceProgram.VehicleManagementSystem;


public class Moped implements TwoWheeler {

    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufacturingYear;
    private double price;
    private double fuel;
    private double speed;
    private double distance; 
    
    Moped(){
    	
    }
    
    Moped(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price, double fuel, double speed, double distance){
    	
    	this.brand = brand;
    	this.model = model;
    	this.registrationNumber = registrationNumber;
    	this.color = color;
    	this.manufacturingYear = manufacturingYear;
    	this.price = price;
    	this.fuel = fuel;
    	this.speed = 0;
    	this.distance = distance;
    }

    @Override
    public void start() {
        System.out.println("Moped started.");
    }

    @Override
    public void stop() {
    	speed = 0;
        System.out.println("Moped stopped.");
    }

    @Override
    public void brake() {
    	speed = Math.max(0, speed - 10);
        System.out.println("Moped brakes applied.");
    }

    @Override
    public void accelerate() {
    	speed+=10;
        System.out.println("Moped is accelerating.");
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
        System.out.println("Wear a helmet before riding.");
    }

    
    @Override
	public void kickStart() {
		System.out.println("Moped Kick-start activated");
		
	}

	@Override
	public void balance() {
		System.out.println("Moped Balancing Operation");
		
	}
	
	@Override
    public String toString() {
        return "Moped [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: " + registrationNumber
                + ", Color is: " + color + ", Year is: " + manufacturingYear
                + ", Price is: " + price + ", Fuel is: " + fuel
                + ", Speed is: " +speed + "]";
    }
}
