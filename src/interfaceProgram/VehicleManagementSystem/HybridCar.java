package interfaceProgram.VehicleManagementSystem;

public class HybridCar implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double batteryCapacity;
	private double speed;
	private int seatingCapacity;
	private String powerMode;

	HybridCar() {

	}

	HybridCar(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuelCapacity, double batteryCapacity, double speed, int seatingCapacity, String powerMode) {

		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.batteryCapacity = batteryCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.powerMode = powerMode;
	}

	@Override
	public void start() {
		System.out.println("Hybrid car power system started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Hybrid car stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Hybrid car brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Hybrid car accelerating.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 25.0; // Illustrative km per litre
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearSeatBelt() {
		System.out.println("Fasten your seat belt.");
	}

	@Override
	public void openBoot() {
		System.out.println("Hybrid car boot opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "HybridCar [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", FuelCapacity is: " + fuelCapacity + ", BatteryCapacity is: " + batteryCapacity
				+ ", MaxSpeed is: " + speed + ", SeatingCapacity is: " + seatingCapacity + ", PowerMode is: "
				+ powerMode + "]";
	}
}
