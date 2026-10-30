package interfaceProgram.VehicleManagementSystem;

public class ElectricCar implements FourWheeler {

    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufacturingYear;
    private double price;
    private double batteryCapacity;
    private double speed;
    private int seatingCapacity;
    private double rangePerCharge;
    private String chargingType;
    
    ElectricCar(){
    	
    }
    
    ElectricCar(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price, 
			double batteryCapacity, double speed, int seatingCapacity, double rangePerCharge, String chargingType){
		
		this.brand = brand;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		this.price = price;
		this.batteryCapacity = batteryCapacity;
		this.speed = speed;
		this.seatingCapacity = seatingCapacity;
		this.rangePerCharge = rangePerCharge;
		this.chargingType = chargingType;
	}

    @Override
    public void start() {
        System.out.println("Electric car powered on.");
    }

    @Override
    public void stop() {
    	speed = 0;
        System.out.println("Electric car stopped.");
    }

    @Override
    public void brake() {
    	speed = Math.max(0, speed - 10);
        System.out.println("Electric car brakes applied.");
    }

    @Override
    public void accelerate() {
    	speed+=10;
        System.out.println("Electric car accelerating silently.");
    }

    @Override
    public double fuelUsed(double distance) {
        return distance / mileage();
    }

    @Override
    public double mileage() {
        return 7.5; // Illustrative km per kWh
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
        System.out.println("Electric car boot opened.");
    }

    @Override
    public void displaySeatingCapacity() {
        System.out.println("Seating capacity: " + seatingCapacity);
    }

    @Override
    public String toString() {
        return "ElectricCar [Brand is: " + brand + ", Model is: " + model
                + ", RegistrationNumber is: " + registrationNumber
                + ", Color is: " + color + ", Year is: " + manufacturingYear
                + ", Price is: " + price + ", BatteryCapacity is: " + batteryCapacity
                + " kWh, MaxSpeed is: " + speed
                + ", SeatingCapacity is: " + seatingCapacity
                + ", RangePerCharge is: " + rangePerCharge
                + ", ChargingType is: " + chargingType + "]";
    }
}
