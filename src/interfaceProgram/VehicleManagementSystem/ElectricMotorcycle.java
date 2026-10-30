package interfaceProgram.VehicleManagementSystem;

public class ElectricMotorcycle implements TwoWheeler {

	private String brand;
	private String model;
	private String registrationNumber;
	private String color;
	private int manufacturingYear;
	private double price;
	private double batteryCapacity;
	private double speed;
	private double rangePerCharge;
	private String chargingType;
	
	ElectricMotorcycle(){
		
	}
	
	ElectricMotorcycle(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
			double batteryCapacity, double speed, double rangePerCharge, String chargingType){
		
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.batteryCapacity = batteryCapacity;
		this.speed = speed;
		this.rangePerCharge = rangePerCharge;
		this.chargingType = chargingType;
	}

	@Override
	public void start() {
		System.out.println("Electric motorcycle powered on.");
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Electric motorcycle stopped.");
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed - 10);
		System.out.println("Electric motorcycle brakes applied.");
	}

	@Override
	public void accelerate() {
		speed += 10;
		System.out.println("Electric motor delivering instant acceleration.");
	}

	@Override
	public double fuelUsed(double distance) {
		return distance / mileage();
	}

	@Override
	public double mileage() {
		return 30.0; // Illustrative km per kWh
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
	}

	@Override
	public void wearHelmet() {
		System.out.println("Wear an approved helmet.");
	}

	
	@Override
	public void kickStart() {
		System.out.println("Electric Motorcycle Kick-Start Started");

	}

	@Override
	public void balance() {
		System.out.println("Balance Electric Motorcycle Properly");

	}
	
	@Override
	public String toString() {
		return "ElectricMotorcycle [Brand is: " + brand + ", Model is: " + model + ", RegistrationNumber is: "
				+ registrationNumber + ", Color is: " + color + ", Year is: " + manufacturingYear + ", Price=" + price
				+ ", BatteryCapacity is: " + batteryCapacity + " kWh" + ", Speed is: " + speed + ", RangePerCharge is: "
				+ rangePerCharge + ", ChargingType is: " + chargingType + "]";
	}
}
