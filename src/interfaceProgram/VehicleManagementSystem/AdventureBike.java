package interfaceProgram.VehicleManagementSystem;

public class AdventureBike implements TwoWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuel;
	private double speed;
	private double engineCapacity;
	private String suspensionType;
	
	AdventureBike(){
		
	}
	
	AdventureBike(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuel, double speed, double engineCapacity, String suspensionType){
		
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuel = fuel;
		this.speed = speed;
		this.engineCapacity = engineCapacity;
		this.suspensionType = suspensionType;
	}

	@Override
	public void start() {
		System.out.println("Adventure bike engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Adventure bike stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Adventure bike brakes applied.");
	}

	@Override
	public void accelerate() {
		speed+=10;
		System.out.println("Adventure bike accelerating on the trail.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 28.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearHelmet() {
		System.out.println("Wear a protective adventure riding helmet.");
	}

	@Override
	public void kickStart() {
		System.out.println("CruiserBike Kick-Start Activated");
	}

	@Override
	public void balance() {
		System.out.println("Balanced the CruiserBike Properly");

	}

	@Override
	public String toString() {
		return "AdventureBike [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: " + registrationNumber
				+ ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: " + price + ", Fuel is: " + fuel
				+ ", Speed is: " + speed + ", EngineCapacity is: " + engineCapacity + ", SuspensionType is: " + suspensionType
				+ "]";
	}

}
