package interfaceProgram.VehicleManagementSystem;


public class ElectricScooter implements TwoWheeler {

    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufacturingYear;
    private double price;
    private double distance;
    private double batteryCapacity;
    private double speed;
    
    ElectricScooter(){
    	
    }
    
    ElectricScooter(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price, double distance, double batteryCapacity, double speed){
    	
    	this.brand = brand;
    	this.model = model;
    	this.registrationNumber = registrationNumber;
    	this.color = color;
    	this.manufacturingYear = manufacturingYear;
    	this.price = price;
    	this.distance = distance;
    	this.batteryCapacity = batteryCapacity;
    	this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println("Electric scooter powered on.");
    }

    @Override
    public void stop() {
    	speed = 0;
        System.out.println("Electric scooter stopped.");
    }

    @Override
    public void brake() {
    	speed = Math.max(0, speed -10);
        System.out.println("Electric scooter brakes applied.");
    }

    @Override
    public void accelerate() {
    	speed+=10;
        System.out.println("Electric motor speed increased.");
    }

    @Override
    public double fuelUsed(double distance) {
        return distance / mileage();
    }

    @Override
    public double mileage() {
        return 100.0; 
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public void wearHelmet() {
        System.out.println("Wear a helmet while riding.");
    }

    
    @Override
	public void kickStart() {
		System.out.println("Electric Scooter Kick-start activated");
		
	}

	@Override
	public void balance() {
		System.out.println("Electric Scooter Balancing Operation");
		
	}
	
	@Override
    public String toString() {
        return "ElectricScooter [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: " + registrationNumber
                + ", Color is: " + color + ", Year is: " + manufacturingYear
                + ", Price is: " + price + ", BatteryCapacity is: " + batteryCapacity
                + " kWh, Speed is: " +speed + "]";
    }
}
