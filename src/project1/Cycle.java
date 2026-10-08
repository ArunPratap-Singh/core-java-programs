package project1;

import java.util.Random;

public class Cycle extends Vehicle {

	private int gears;
	private boolean gearSystem;

	public Cycle(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int gears, boolean gearSystem) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price);
		this.gears = gears;
		this.gearSystem = gearSystem;
	}

	@Override
	public void drive() {

		System.out.println("\nCycle is being pedalled.");

		setSpeed(getSpeed() + 3);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int performance = random.nextInt(20) + (int) getSpeed() + gears;

		System.out.println("Cycle racing...");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nGears : " + gears + "\nGear System : " + gearSystem;
	}
}
