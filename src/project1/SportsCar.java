package project1;

import java.util.Random;

public class SportsCar extends Car {

	private boolean turbo;
	private int horsepower;

	public SportsCar(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int doors, boolean automatic, boolean turbo, int horsepower) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price, doors, automatic);
		this.turbo = turbo;
		this.horsepower = horsepower;
	}

	@Override
	public void drive() {

		System.out.println("\nSports Car accelerating!");

		setSpeed(getSpeed() + 15);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Turbo: " + turbo);
		System.out.println("Horsepower: " + horsepower);
		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int turboBonus = turbo ? 30 : 10;

		int performance = random.nextInt(41) + (int) getSpeed() + turboBonus + horsepower / 10 + getUpgradeLevel() * 7;

		System.out.println("Sports Car racing with turbo!");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nTurbo : " + turbo + "\nHorsepower : " + horsepower;
	}
}
