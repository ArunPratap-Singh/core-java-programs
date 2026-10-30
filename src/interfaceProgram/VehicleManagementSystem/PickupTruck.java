package interfaceProgram.VehicleManagementSystem;

public class PickupTruck implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double speed;
	private int seatingCapacity;
	private double payloadCapacityKg;
	private double cargoBedLength;

	PickupTruck() {

	}

	PickupTruck(String brand, String model, String registrationNumber, String color, int manufacturingYear,
			double price, double fuelCapacity, double speed, int seatingCapacity, double payloadCapacityKg,
			double cargoBedLength) {

		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.payloadCapacityKg = payloadCapacityKg;
		this.cargoBedLength = cargoBedLength;
	}

	@Override
	public void start() {
		System.out.println("Pickup truck engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Pickup truck stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Pickup truck brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Pickup truck accelerating under load.");
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
		System.out.println("Fasten your seat belt.");
	}

	@Override
	public void openBoot() {
		System.out.println("Pickup cargo tailgate opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "PickupTruck [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", FuelCapacity is: " + fuelCapacity + ", MaxSpeed is: " + speed + ", SeatingCapacity is: "
				+ seatingCapacity + ", PayloadCapacityKg is: " + payloadCapacityKg + ", CargoBedLength is: "
				+ cargoBedLength + "]";
	}
}
