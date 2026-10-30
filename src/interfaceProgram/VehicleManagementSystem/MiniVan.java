package interfaceProgram.VehicleManagementSystem;

public class MiniVan implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double speed;
	private int seatingCapacity;
	private double bootSpace;
	private boolean hasSlidingDoors;

	MiniVan() {

	}

	MiniVan(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double fuelCapacity, double speed, int seatingCapacity, double bootSpace, boolean hasSlidingDoors) {

		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.bootSpace = bootSpace;
		this.hasSlidingDoors = hasSlidingDoors;
	}

	@Override
	public void start() {
		System.out.println("Minivan engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Minivan stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Minivan brakes applied.");
	}

	@Override
	public void accelerate() {
		speed+=10;
		System.out.println("Minivan accelerating.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 17.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearSeatBelt() {
		System.out.println("All occupants must fasten their seat belts.");
	}

	@Override
	public void openBoot() {
		System.out.println("Minivan luggage compartment opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "Minivan [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: " + registrationNumber
				+ ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: " + price
				+ ", FuelCapacity is: " + fuelCapacity + ", MaxSpeed is: " + speed + ", SeatingCapacity is: "
				+ seatingCapacity + ", BootSpace is: " + bootSpace + ", HasSlidingDoors is: " + hasSlidingDoors + "]";
	}
}
