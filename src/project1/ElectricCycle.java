package project1;

import java.util.Random;

public class ElectricCycle extends Vehicle {

	private int battery;
	private int batteryCapacity;
	private boolean pedalAssist;

	public ElectricCycle(int vehicleId, String brand, String model, String color, double speed, double maxSpeed, double maxFuel, double price, int batteryCapacity, boolean pedalAssist) {

		super(vehicleId, brand, model, color, speed, maxSpeed, maxFuel, price);
		this.batteryCapacity = batteryCapacity;
		this.battery = batteryCapacity;
		this.pedalAssist = pedalAssist;
	}

	@Override
	public void drive() {

		if (battery <= 0) {
			System.out.println("Battery empty!");
			return;
		}

		System.out.println("\nElectric Cycle using battery power.");

		battery -= 10;

		setSpeed(getSpeed() + 8);

		if (getSpeed() > getMaxSpeed()) {
			setSpeed(getMaxSpeed());
		}

		System.out.println("Battery: " + battery + "%");
		System.out.println("Speed: " + getSpeed());
	}

	@Override
	public int race() {

		Random random = new Random();

		int performance = random.nextInt(35) + (int) getSpeed() + battery / 5;

		System.out.println("Electric Cycle racing silently!");
		System.out.println("Race Performance: " + performance);

		return performance;
	}

	public void chargeBattery() {

		battery = batteryCapacity;

		System.out.println("Battery fully charged.");
	}

	@Override
	public String toString() {

		return super.toString() + "\nBattery : " + battery + "%" + "\nBattery Capacity : " + batteryCapacity + "%" + "\nPedal Assist : " + pedalAssist;
	}
}
