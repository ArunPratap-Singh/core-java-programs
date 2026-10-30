package interfaceProgram.VehicleManagementSystem;

public class DirtBike implements TwoWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuel;
	private double speed;
	private double engineCapacity;
	private String tyreType;
	
	DirtBike(){
		
	}
	
	DirtBike(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuel, double speed, double engineCapacity, String tyreType){
		
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuel = fuel;
		this.speed = speed;
		this.engineCapacity = engineCapacity;
		this.tyreType = tyreType;
	}
	
	@Override
	public void start() {
		System.out.println("Dirt bike engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Dirt bike stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Dirt bike brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Dirt bike accelerating on rough terrain.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 25.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearHelmet() {
		System.out.println("Wear an approved off-road helmet.");
	}

	@Override
	public void kickStart() {
		System.out.println("DirtBike Kick-Start Started");
	}

	@Override
	public void balance() {
		System.out.println("Balance the DirtBike Properly");

	}

	@Override
	public String toString() {
		return "DirtBike [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price=" + price
				+ ", FuelCapacity=" + fuel + ", Speed=" + speed + ", EngineCapacity=" + engineCapacity + ", TyreType="
				+ tyreType + "]";
	}
}