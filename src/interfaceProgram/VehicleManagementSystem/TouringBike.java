package interfaceProgram.VehicleManagementSystem;

public class TouringBike implements TwoWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuel;
	private double speed;
	private double engineCapacity;
	private boolean hasWindshield;
	
	TouringBike(){
		
	}
	
	TouringBike(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuel, double speed, double engineCapacity, boolean hasWindShield){
		
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuel = fuel;
		this.speed = speed;
		this.engineCapacity = engineCapacity;
		this.hasWindshield = hasWindShield;
	}

	@Override
	public void start() {
		System.out.println("Touring bike engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Touring bike stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Touring bike braking system activated.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Touring bike increasing cruising speed.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 22.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearHelmet() {
		System.out.println("Wear a helmet for long-distance touring.");
	}

	@Override
	public void kickStart() {
		System.out.println("TouringBike Kick Start Activated");

	}

	@Override
	public void balance() {
		System.out.println("Balance the Toring Bike Properly");

	}

	@Override
	public String toString() {
		return "TouringBike [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: " + registrationNumber
				+ ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: " + price + ", FuelCapacity is: " + fuel
				+ ", Speed is: " + speed + ", EngineCapacity is: " + engineCapacity + ", HasWindshield is: " + hasWindshield
				+ "]";
	}

}
