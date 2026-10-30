package interfaceProgram.VehicleManagementSystem;

public class Scooter implements TwoWheeler{
	
	private String brand;
	private String model;
	private String color;
	private double fuel;
	private double distance;
	private double price;
	private double speed;
	private double storageCapacity;
	
	Scooter(){
		
	}
	
	Scooter(String brand, String model, String color, double fuel, double distance, double price, double speed, double storageCapacity){
		
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.fuel = fuel;
		this.distance = distance;
		this.price = price;
		this.speed = 0;
		this.storageCapacity = storageCapacity;
	}
	

	@Override
	public void start() {
		System.out.println("Scooter started using the self-start system.");
		
	}

	@Override
	public void stop() {
		speed = 0;
		System.out.println("Scooter stopped.");
		
	}

	@Override
	public void brake() {
		speed = Math.max(0, speed -10);
		System.out.println("Auto speed: " +speed+" Km/h");
		
	}

	@Override
	public void accelerate() {
		speed+= 10;
		System.out.println("Scooter is accelerating.");
		
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
		System.out.println("Wear a helmet while riding the scooter.");
		
	}

	@Override
	public void kickStart() {
		System.out.println("Scooter Kick-start activated");
		
	}

	@Override
	public void balance() {
		System.out.println("Scooter Balancing Operation");
		
	}
	
	public String toString() {
		
		return " Scooter [Brand is: " +brand+", Model is: " +model+", Color is: " +color+", Fuel is: " +fuel+" litres"
		+", Distance is: " +distance+" km"+", Price is: " +price+", Speed is: " +speed+" Km/h"
		+", Strorage Capacity is: " +storageCapacity+" litres"+", Mileage is: " +mileage()+" Km/l ]";
	}
	

}
