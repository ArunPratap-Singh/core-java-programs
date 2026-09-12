package inheritanceProgramingMultilevel.Vehicles;

public class AutonomousCar extends SmartCar {

	int automationLevel;
	String sensorType;
	
	AutonomousCar(){
		
	}

	AutonomousCar(String brand, String model, int year, String fuelType, int engineCapacity, int numberOfDoors, String transmission, int batteryCapacity, int chargingTime, String operatingSystem, boolean connectedCar, int automationLevel, String sensorType) {

		super(brand, model, year, fuelType, engineCapacity, numberOfDoors, transmission, batteryCapacity, chargingTime, operatingSystem, connectedCar);
		this.automationLevel = automationLevel;
		this.sensorType = sensorType;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAutomationLevel is: " + automationLevel + "\nSensorType is: " + sensorType;
	}

}
