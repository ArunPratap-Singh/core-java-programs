package project1;

import java.util.Random;

public class Car extends Vehicle {

	private int doors;
	private boolean automatic;

	public Car(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int doors, boolean automatic) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price);
		this.doors = doors;
		this.automatic = automatic;
	}

	@Override
	public void drive() {

		System.out.println("\nCar is driving smoothly.");

		setSpeed(getSpeed() + 5);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int performance = random.nextInt(31) + (int) getSpeed() + getUpgradeLevel() * 5;

		System.out.println("Car racing...");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nDoors : " + doors + "\nAutomatic : " + automatic;
	}
}
