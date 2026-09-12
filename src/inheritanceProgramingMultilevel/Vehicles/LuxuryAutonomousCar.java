package inheritanceProgramingMultilevel.Vehicles;

public class LuxuryAutonomousCar extends AutonomousCar {

	String interiorType;
	double price;
	
	LuxuryAutonomousCar(){
		
	}

	LuxuryAutonomousCar(String brand, String model, int year, String fuelType, int engineCapacity, int numberOfDoors, String transmission, int batteryCapacity, int chargingTime, String operatingSystem, boolean connectedCar, int automationLevel, String sensorType, String interiorType, double price) {

		super(brand, model, year, fuelType, engineCapacity, numberOfDoors, transmission, batteryCapacity, chargingTime, operatingSystem, connectedCar, automationLevel, sensorType);

		this.interiorType = interiorType;
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + "\nInteriorType is: " + interiorType + "\nPrice is: " + price + "\n===============================";
	}

}
