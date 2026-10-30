package interfaceProgram.VehicleManagementSystem;


public class ElectricRickshaw implements ThreeWheeler {

    private String brand;
    private String model;
    private String registrationNumber;
    private String color;
    private int manufacturingYear;
    private double price;
    private double batteryCapacity;
    private double speed;
    private int passengerCapacity;
    private double cargoCapacityKg;
    
    ElectricRickshaw(){
    	
    }
    
    ElectricRickshaw(String brand, String model, String registrationNumber, String color, int manufacturingYear, double price,
    		double batteryCapacity, double speed, int passengerCapacity, double cargoCapacityKg){
    	
    	this.brand = brand;
    	this.model = model;
    	this.registrationNumber = registrationNumber;
    	this.color = color;
    	this.manufacturingYear = manufacturingYear;
    	this.price = price;
    	this.batteryCapacity = batteryCapacity;
    	this.speed = 0;
    	this.passengerCapacity = passengerCapacity;
    	this.cargoCapacityKg = cargoCapacityKg;
    	
    }

    @Override
    public void start() {
        System.out.println("Electric rickshaw powered on.");
    }

    @Override
    public void stop() {
    	speed = 0;
        System.out.println("Electric rickshaw stopped.");
    }

    @Override
    public void brake() {
    	speed = Math.max(0, speed - 10);
        System.out.println("Electric rickshaw brakes applied.");
    }

    @Override
    public void accelerate() {
    	speed+=10;
        System.out.println("Electric motor accelerating.");
    }

    @Override
    public double fuelUsed(double distance) {
        return distance / mileage();
    }

    @Override
    public double mileage() {
        return 10.0; 
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public void carryPassengers() {
        System.out.println("Electric Rickshaw is Carrying Passenger");
    }

    @Override
    public void carryGoods() {
        System.out.println("Carry only permitted luggage and goods.");
    }

    
	@Override
	public void displayPassengerCapacity() {
		System.out.println("Passenger Capacity is: " +passengerCapacity);
		
	}

	@Override
	public void goodsCarryCapacity() {
		System.out.println("CargoCapacityKg is: " +cargoCapacityKg);
		
	}
	
	@Override
    public String toString() {
        return "ElectricRickshaw [Brand is: " + brand + ", Model is: " + model
                + ", RegistrationNumber is: " + registrationNumber
                + ", Color is: " + color + ", Year is: " + manufacturingYear
                + ", Price is: " + price + ", BatteryCapacity is: " + batteryCapacity
                + " kWh, Speed is: " + speed
                + ", PassengerCapacity is: " + passengerCapacity
                + ", CargoCapacityKg is: " + cargoCapacityKg + "]";
    }
}
