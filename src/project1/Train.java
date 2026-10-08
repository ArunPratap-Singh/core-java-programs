package project1;

import java.util.Random;

public class Train extends Vehicle {

	private int coaches;
	private boolean electricEngine;

	public Train(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int coaches, boolean electricEngine) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price);
		this.coaches = coaches;
		this.electricEngine = electricEngine;
	}

	@Override
	public void drive() {

		System.out.println("\nTrain accelerating on the railway.");

		setSpeed(getSpeed() + 4);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Coaches: " + coaches);
		System.out.println("Electric Engine: " + electricEngine);
		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int railwayBonus = electricEngine ? 30 : 15;

		int performance = random.nextInt(40) + (int) getSpeed() + railwayBonus + coaches * 2;

		System.out.println("Train racing on railway track!");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nCoaches : " + coaches + "\nElectric Engine : " + electricEngine;
	}
}
