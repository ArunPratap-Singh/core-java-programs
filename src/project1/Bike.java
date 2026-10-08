package project1;

import java.util.Random;

public class Bike extends Vehicle {

	private int engineCC;
	private boolean abs;

	public Bike(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int engineCC, boolean abs) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price);
		this.engineCC = engineCC;
		this.abs = abs;
	}

	@Override
	public void drive() {

		System.out.println("\nBike accelerating quickly!");

		setSpeed(getSpeed() + 10);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Engine: " + engineCC + " CC");
		System.out.println("ABS: " + abs);
		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int performance = random.nextInt(35) + (int) getSpeed() + engineCC / 100 + getUpgradeLevel() * 5;

		System.out.println("Bike racing!");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nEngine CC : " + engineCC + "\nABS : " + abs;
	}
}
