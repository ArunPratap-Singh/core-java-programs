package interfaceProgram.VehicleManagementSystem;

public class MotorizedTricycle implements ThreeWheeler {

    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufacturingYear;
    private double price;
    private double fuel;
    private double speed;
    private double distance;
    private int passengerCapacity;
    private double cargoCapacityKg;
    
    MotorizedTricycle(){
    	
    }
    
    MotorizedTricycle(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
        	double fuel, double speed, double distance, int passengerCapacity, double cargoCapacityKg){
        	
        	this.brand = brand;
        	this.model = model;
        	this.registrationNumber = registrationNumber;
        	this.color = color;
        	this.manufacturingYear = manufacturingYear;
        	this.price = price;
        	this.fuel = fuel;
        	this.speed = speed;
        	this.distance = distance;
        	this.passengerCapacity = passengerCapacity;
        	this.cargoCapacityKg = cargoCapacityKg;
        }

    @Override
    public void start() {
        System.out.println("Motorized tricycle engine started.");
    }

    @Override
    public void stop() {
    	speed = 0;
        System.out.println("Motorized tricycle stopped.");
    }

    @Override
    public void brake() {
    	speed = Math.max(0, speed - 10);
        System.out.println("Motorized tricycle brakes applied.");
    }

    @Override
    public void accelerate() {
    	speed+=10;
        System.out.println("Motorized tricycle accelerating.");
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
    public void carryPassengers() {
        System.out.println("Motorized Tricycle is carrying passengers");
    }

    @Override
    public void carryGoods() {
        System.out.println("Limited luggage can be carried within permitted limits.");
    }

    
	@Override
	public void displayPassengerCapacity() {
		System.out.println("PassengerCapacity is: " +passengerCapacity);
		
	}

	@Override
	public void goodsCarryCapacity() {
		System.out.println("CargoCapacity is: " +cargoCapacityKg);
		
	}@Override
    public String toString() {
        return "MotorizedTricycle [Brand is: " + brand + ", Model is: " + model
                + ", RegistrationNumber is: " + registrationNumber
                + ", Color is: " + color + ", Year is: " + manufacturingYear
                + ", Price is: " + price + ", Fuel is: " + fuel
                + ", Speed is: " + speed
                + ", PassengerCapacity is: " + passengerCapacity
                + ", CargoCapacityKg is: " + cargoCapacityKg + "]";
    }
	
	
}
