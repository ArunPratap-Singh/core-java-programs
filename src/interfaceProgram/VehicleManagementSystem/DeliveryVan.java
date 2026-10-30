package interfaceProgram.VehicleManagementSystem;

public class DeliveryVan implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double speed;
	private int seatingCapacity;
	private double cargoCapacityKg;
	private double cargoVolumeCubicMetres;

	DeliveryVan() {

	}

	DeliveryVan(String brand, String model, String registrationNumber, String color, int manufacturingYear,
			double price, double fuelCapacity, double speed, int seatingCapacity, double cargoCapacityKg,
			double cargoVolumeCubicMetres) {

		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.cargoCapacityKg = cargoCapacityKg;
		this.cargoVolumeCubicMetres = cargoVolumeCubicMetres;
	}

	@Override
	public void start() {
		System.out.println("Delivery van engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Delivery van stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Delivery van brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Delivery van accelerating.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 13.0;
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
		System.out.println("Delivery van rear cargo doors opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "DeliveryVan [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", FuelCapacity is: " + fuelCapacity + ", MaxSpeed is: " + speed + ", SeatingCapacity is: "
				+ seatingCapacity + ", CargoCapacityKg is: " + cargoCapacityKg + ", CargoVolumeCubicMetres is: "
				+ cargoVolumeCubicMetres + "]";
	}
}
