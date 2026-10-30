package interfaceProgram.VehicleManagementSystem;

public class SedanCar implements FourWheeler {

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
	private String transmissionType;
	
	SedanCar(){
		
	}
	
	SedanCar(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price, 
			double fuelCapacity, double speed, int seatingCapacity, double bootSpace, String transmissionType){
		
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
		this.transmissionType = transmissionType;
	}


	@Override
	public void start() {
		System.out.println("Sedan engine started.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Sedan stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Sedan braking system activated.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Sedan accelerating smoothly.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 18.0;
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
		System.out.println("Sedan boot opened.");
	}

	@Override
	public void displaySeatingCapacity() {
		System.out.println("Seating capacity: " + seatingCapacity);
	}

	@Override
	public String toString() {
		return "SedanCar [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price is: "
				+ price + ", FuelCapacity is: " + fuelCapacity + ", MaxSpeed is: " + speed + ", SeatingCapacity is: "
				+ seatingCapacity + ", BootSpace is: " + bootSpace + ", TransmissionType is: " + transmissionType + "]";
	}
}
