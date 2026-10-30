package interfaceProgram.VehicleManagementSystem;

public class Bike implements TwoWheeler{
	
	private String brand;
	private String model;
	private String color;
	private int engineCC;
	private double fuel;
	private double distance;
	private double price;
	private double speed;
	
	Bike(){
		
	}
	
	Bike(String brand, String model, String color, int engineCC, double fuel, double distance, double price, double speed){
		
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.engineCC = engineCC;
		this.fuel = fuel;
		this.distance = distance;
		this.price = price;
		this.speed = 0;
	}
	
	
	

	@Override
	public void start() {
		System.out.println("Bike Engine Started");
		
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("After putting brake! Bike Stopped");
		
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed -10);
		System.out.println("Bike Speed: " +speed+" Km/h");
		
	}

	@Override
	public void accelerate() {
		speed+= 10;
		System.out.println("Bike Speed: " +speed+" Km/h");
		
	}

	@Override
	public double fuelUsed(double distance) {
		
		return distance/mileage();
	}

	@Override
	public double mileage() {
		
		return distance/fuel;
	}

	@Override
	public void displayDetails() {
		System.out.println(this);
		
	}

	@Override
	public void wearHelmet() {
		System.out.println("Wear a Helmet Before Riding a Bike.....");
		System.out.println("It is Important For Safety.....");
		
	}

	@Override
	public void kickStart() {
		System.out.println("Bike Kick-Start Activated");
		
	}

	@Override
	public void balance() {
		System.out.println("Balanced the Bike Properly");
		
	}
	
	@Override
	public String toString() {
		
		return "Bike[Brand is: " +brand+", Model is: " +model+", Color is: " +color+", EngineCC is: " +engineCC+", Fuel is: " +fuel+" liters"+", Distance is: " +distance+" Km" +", Price is: " +price+
				", Speed is: " +speed+" km/h" +", Mileage is: " +mileage()+"Km/l]";
	}
	
	

}
