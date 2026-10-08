package project1;

import java.util.Random;

public class Bus extends Vehicle {

	private int passengerCapacity;
	private boolean airConditioned;

	public Bus(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int passengerCapacity, boolean airConditioned) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price);
		this.passengerCapacity = passengerCapacity;
		this.airConditioned = airConditioned;
	}

	@Override
	public void drive() {

		System.out.println("\nBus is driving carefully.");

		setSpeed(getSpeed() + 2);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Passengers Capacity: " + passengerCapacity);
		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int performance = random.nextInt(25) + (int) getSpeed() + getUpgradeLevel() * 3;

		System.out.println("Bus entered the heavy vehicle race!");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nPassenger Capacity: " + passengerCapacity + "\nAir Conditioned  : " + airConditioned;
	}
}
