package project1;

import java.util.Random;

public class SportsBike extends Bike {

	private boolean turbo;
	private int racingMode;

	public SportsBike(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int engineCC, boolean abs, boolean turbo, int racingMode) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price, engineCC, abs);
		this.turbo = turbo;
		this.racingMode = racingMode;
	}

	@Override
	public void drive() {

		System.out.println("\nSports Bike entered RACING MODE!");

		setSpeed(getSpeed() + 20);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Turbo: " + turbo);
		System.out.println("Racing Mode: " + racingMode);
		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int turboBonus = turbo ? 35 : 10;

		int performance = random.nextInt(45) + (int) getSpeed() + turboBonus + racingMode * 10 + getUpgradeLevel() * 8;

		System.out.println("Sports Bike racing at extreme speed!");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nTurbo : " + turbo + "\nRacing Mode : " + racingMode;
	}
}
