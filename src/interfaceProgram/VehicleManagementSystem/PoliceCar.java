package interfaceProgram.VehicleManagementSystem;

public class PoliceCar implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double speed;
	private int seatingCapacity;
	private boolean hasSiren;
	private boolean hasBeaconLight;
	private String department;

	PoliceCar() {

	}

	PoliceCar(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuelCapacity, double speed, int seatingCapacity, boolean hasSiren, boolean hasBeaconLight,
			String department) {

		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.hasSiren = hasSiren;
		this.hasBeaconLight = hasBeaconLight;
		this.department = department;
	}

	@Override
	public void start() {
		System.out.println("Police patrol car started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Police patrol car stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Police car brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Police patrol car accelerating.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 14.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearSeatBelt() {
		System.out.println("Occupants must fasten seat belts.");
	}

	@Override
	public void openBoot() {
		System.out.println("Police car equipment compartment opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "PoliceCar [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", FuelCapacity is: " + fuelCapacity + ", MaxSpeed is: " + speed + ", SeatingCapacity is: "
				+ seatingCapacity + ", HasSiren is: " + hasSiren + ", HasBeaconLight is: " + hasBeaconLight
				+ ", Department is: " + department + "]";
	}
}
