package project1;

public abstract class Vehicle {

	private int vehicleId;
	private String brand;
	private String model;
	private String color;

	private double speed;
	private double maxSpeed;

	private double fuel;
	private double maxFuel;

	private int health;
	private double price;

	private int nitro;
	private int upgradeLevel;

	private Person driver;

	// Constructor
	public Vehicle(int vehicleId, String brand, String model, String color, double speed, double maxSpeed,
			double maxFuel, double price) {

		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.maxFuel = maxFuel;
		this.fuel = maxFuel;
		this.health = 100;
		this.price = price;
		this.nitro = 3;
		this.upgradeLevel = 1;
	}

	// Abstract methods

	public abstract void drive();

	public abstract int race();

	// Common method

	public void startEngine() {
		System.out.println("\n" + brand + " " + model + " engine started!");
	}

	public void stopEngine() {
		System.out.println("\n" + brand + " " + model + " engine stopped.");
	}

	public void useNitro() {

		if (nitro > 0) {

			System.out.println("NITRO BOOST ACTIVATED!");

			speed += 20;

			if (speed > maxSpeed) {
				speed = maxSpeed;
			}

			nitro--;

			System.out.println("Current Speed: " + speed);
			System.out.println("Nitro Remaining: " + nitro);

		} else {
			System.out.println("No nitro available!");
		}
	}

	public void refuel() {

		fuel = maxFuel;

		System.out.println("Vehicle refueled.");
		System.out.println("Fuel: " + fuel);
	}

	public void repair() {

		health = 100;

		System.out.println("Vehicle repaired.");
		System.out.println("Health: " + health);
	}

	public void changeColor(String color) {

		this.color = color;

		System.out.println("Vehicle color changed to " + color);
	}

	public void upgradeVehicle() {

		upgradeLevel++;

		maxSpeed += 10;
		speed += 5;

		System.out.println("\nVehicle upgraded!");
		System.out.println("Upgrade Level: " + upgradeLevel);
		System.out.println("Maximum Speed: " + maxSpeed);
	}

	public void damageVehicle(int damage) {

		health -= damage;

		if (health < 0) {
			health = 0;
		}

		System.out.println("Vehicle received damage: " + damage);
		System.out.println("Health: " + health);
	}

	public boolean isDestroyed() {

		return health <= 0;
	}

	// Getters

	public int getVehicleId() {
		return vehicleId;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public double getSpeed() {
		return speed;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public double getFuel() {
		return fuel;
	}

	public double getMaxFuel() {
		return maxFuel;
	}

	public int getHealth() {
		return health;
	}

	public double getPrice() {
		return price;
	}

	public int getNitro() {
		return nitro;
	}

	public int getUpgradeLevel() {
		return upgradeLevel;
	}

	public Person getDriver() {
		return driver;
	}

	public void setDriver(Person driver) {
		this.driver = driver;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {

		return "\n========== VEHICLE INFORMATION ==========" + "\nVehicle ID : " + vehicleId + "\nBrand : " + brand
				+ "\nModel : " + model + "\nColor : " + color + "\nSpeed : " + speed + "\nMaximum Speed : " + maxSpeed
				+ "\nFuel : " + fuel + "\nMaximum Fuel : " + maxFuel + "\nHealth : " + health + "\nPrice : ₹" + price
				+ "\nNitro : " + nitro + "\nUpgrade Level : " + upgradeLevel + "\nDriver : "
				+ (driver == null ? "Not Assigned" : driver.getName()) + "\n==========================================";
	}
}