package interfaceProgram.VehicleManagementSystem;

public class PassengerTricycle implements ThreeWheeler {

    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufacturingYear;
    private double price;
    private double fuel;
    private double speed;
    private int passengerCapacity;
    private double cargoCapacityKg;
    
    PassengerTricycle(){
    	
    }
    
    PassengerTricycle(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
    	double fuel, double speed, int passengerCapacity, double cargoCapacityKg){
    	
    	this.brand = brand;
    	this.model = model;
    	this.registrationNumber = registrationNumber;
    	this.color = color;
    	this.manufacturingYear = manufacturingYear;
    	this.price = price;
    	this.fuel = fuel;
    	this.speed = speed;
    	this.passengerCapacity = passengerCapacity;
    	this.cargoCapacityKg = cargoCapacityKg;
    }

    @Override
    public void start() {
        System.out.println("Pedal passenger tricycle ready to move.");
    }

    @Override
    public void stop() {
    	speed = 0;
        System.out.println("Passenger tricycle stopped.");
    }

    @Override
    public void brake() {
    	speed = Math.max(0, speed - 10);
        System.out.println("Passenger tricycle brakes applied.");
    }

    @Override
    public void accelerate() {
    	speed+=10;
        System.out.println("Pedalling increases the tricycle's speed.");
    }

    @Override
    public double fuelUsed(double distance) {
        return 0.0; // Human-powered; no fuel consumed
    }

    @Override
    public double mileage() {
        return 0.0; // Not applicable to a human-powered vehicle
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public void carryPassengers() {
        System.out.println("Passenger Tricycle is carrying passenger");
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
		
	}
	
	@Override
    public String toString() {
        return "PassengerTricycle [Brand is: " + brand + ", Model is: " + model
                + ", RegistrationNumber is: " + registrationNumber
                + ", Color is: " + color + ", Year is: " + manufacturingYear
                + ", Price is: " + price + ", Fuel is: " + fuel
                + ", Speed is: " + speed
                + ", PassengerCapacity is: " + passengerCapacity
                + ", CargoCapacityKg is: " + cargoCapacityKg + "]";
    }
}
