package project1;

import java.util.Random;

public class SportsCycle extends Cycle {

	private boolean aerodynamic;
	private int lightweightLevel;

	public SportsCycle(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int gears, boolean gearSystem, boolean aerodynamic, int lightweightLevel) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price, gears, gearSystem);
		this.aerodynamic = aerodynamic;
		this.lightweightLevel = lightweightLevel;
	}

	@Override
	public void drive() {

		System.out.println("\nSports Cycle accelerating!");

		setSpeed(getSpeed() + 7);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Aerodynamic: " + aerodynamic);
		System.out.println("Current Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int aerodynamicBonus = aerodynamic ? 25 : 5;

		int performance = random.nextInt(30) + (int) getSpeed() + aerodynamicBonus + lightweightLevel * 3;

		System.out.println("Sports Cycle racing!");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	@Override
	public String toString() {

		return super.toString() + "\nAerodynamic : " + aerodynamic + "\nLightweight Level: " + lightweightLevel;
	}
}
