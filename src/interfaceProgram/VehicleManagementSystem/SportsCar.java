package interfaceProgram.VehicleManagementSystem;

public class SportsCar implements FourWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double fuelCapacity;
	private double speed;
	private int seatingCapacity;
	private double engineCapacity;
	private String driveType;
	
	SportsCar(){
		
	}
	
	SportsCar(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price, 
			double fuelCapacity, double speed, int seatingCapacity, double engineCapacity, String driveType){
		
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.engineCapacity = engineCapacity;
		this.driveType = driveType;
	}

	@Override
	public void start() {
		System.out.println("Sports car engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Sports car stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Sports car performance brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Sports car accelerating rapidly.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 9.0;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearSeatBelt() {
		System.out.println("Fasten the seat belt before driving.");
	}

	@Override
	public void openBoot() {
		System.out.println("Sports car luggage compartment opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "SportsCar [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", FuelCapacity is: " + fuelCapacity + ", MaxSpeed is: " + speed + ", SeatingCapacity is: "
				+ seatingCapacity + ", EngineCapacity is: " + engineCapacity + ", DriveType is: " + driveType + "]";
	}
}