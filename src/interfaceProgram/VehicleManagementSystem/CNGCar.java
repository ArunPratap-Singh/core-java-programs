package interfaceProgram.VehicleManagementSystem;

public class CNGCar implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double petrolTankCapacity;
	private double speed;
	private int seatingCapacity;
	private String fuelType;

	CNGCar() {

	}

	CNGCar(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuelCapacity, double petrolTankCapacity, double speed, int seatingCapacity, String fuelType) {

		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.petrolTankCapacity = petrolTankCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.fuelType = fuelType;
	}

	@Override
	public void start() {
		System.out.println("CNG car engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("CNG car stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("CNG car brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("CNG car accelerating.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 30.0; // Illustrative km per kg of CNG
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
		System.out.println("CNG car boot opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "CNGCar [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: " + registrationNumber
				+ ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: " + price
				+ ", CngFuelCapacity is: " + fuelCapacity + ", PetrolTankCapacity is: " + petrolTankCapacity
				+ ", MaxSpeed is: " + speed + ", SeatingCapacity is: " + seatingCapacity + ", FuelType is: " + fuelType
				+ "]";
	}
}
