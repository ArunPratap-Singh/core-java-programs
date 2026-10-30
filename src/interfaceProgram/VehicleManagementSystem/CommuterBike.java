package interfaceProgram.VehicleManagementSystem;

public class CommuterBike implements TwoWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuel;
	private double speed;
	private double engineCapacity;
	private boolean hasElectricStart;
	
	CommuterBike(){
		
	}
	
	CommuterBike(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuel, double speed, double engineCapacity, boolean hasElectricStart){
		
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuel = fuel;
		this.speed = speed;
		this.engineCapacity = engineCapacity;
		this.hasElectricStart = hasElectricStart;
	}

	@Override
	public void start() {
		System.out.println("Commuter bike started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Commuter bike stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Commuter bike brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Commuter bike accelerating for city travel.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 55.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearHelmet() {
		System.out.println("Wear a certified helmet.");
	}

	@Override
	public void kickStart() {
		System.out.println("Commuter Bike Kick-Start Activated");

	}

	@Override
	public void balance() {
		System.out.println("Balance Commuter Bike Properly!");

	}

	@Override
	public String toString() {
		return "CommuterBike [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", fuelCapacity is: " + fuel + ", Speed is: " + speed + ", EngineCapacity is: "
				+ engineCapacity + ", HasElectricStart is: " + hasElectricStart + "]";
	}
}
