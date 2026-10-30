package interfaceProgram.VehicleManagementSystem;

public class AmbulanceVan implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double speed;
	private int seatingCapacity;
	private boolean hasFirstAidKit;
	private boolean hasEmergencySiren;
	private boolean hasStretcher;

	AmbulanceVan() {

	}

	AmbulanceVan(String brand, String model, String registrationNumber, String color, int manufacturingYear,
			double price, double fuelCapacity, double speed, int seatingCapacity, boolean hasFirstAidKit,
			boolean hasEmergencySiren, boolean hasStretcher) {

		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.hasFirstAidKit = hasFirstAidKit;
		this.hasEmergencySiren = hasEmergencySiren;
		this.hasStretcher = hasStretcher;
	}

	@Override
	public void start() {
		System.out.println("Ambulance car engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Ambulance car stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Ambulance brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Ambulance accelerating safely.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 12.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearSeatBelt() {
		System.out.println("Fasten seat belts wherever applicable.");
	}

	@Override
	public void openBoot() {
		System.out.println("Ambulance medical equipment compartment opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Configured seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "AmbulanceCar [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", FuelCapacity is: " + fuelCapacity + ", MaxSpeed is: " + speed + ", SeatingCapacity is: "
				+ seatingCapacity + ", HasFirstAidKit is: " + hasFirstAidKit + ", HasEmergencySiren is: "
				+ hasEmergencySiren + ", HasStretcher is: " + hasStretcher + "]";
	}
}