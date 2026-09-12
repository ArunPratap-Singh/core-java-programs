package inheritanceProgramingMultilevel.Vehicles;

public class SmartCar extends ElectricCar {

	String operatingSystem;
	boolean connectedCar;
	
	SmartCar(){
		
	}

	SmartCar(String brand, String model, int year, String fuelType, int engineCapacity, int numberOfDoors, String transmission, int batteryCapacity, int chargingTime, String operatingSystem, boolean connectedCar) {

		super(brand, model, year, fuelType, engineCapacity, numberOfDoors, transmission, batteryCapacity, chargingTime);
		this.operatingSystem = operatingSystem;
		this.connectedCar = connectedCar;
	}

	@Override
	public String toString() {
		return super.toString() + "\nOperatingSystem is: " + operatingSystem + "\nConnectedCar is: " + connectedCar;
	}

}
