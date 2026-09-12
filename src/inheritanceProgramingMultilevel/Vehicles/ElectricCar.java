package inheritanceProgramingMultilevel.Vehicles;

public class ElectricCar extends Car {

	int batteryCapacity;
	int chargingTime;
	
	ElectricCar(){
		
	}

	ElectricCar(String brand, String model, int year, String fuelType, int engineCapacity, int numberOfDoors, String transmission, int batteryCapacity, int chargingTime) {

		super(brand, model, year, fuelType, engineCapacity, numberOfDoors, transmission);
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
	}

	@Override
	public String toString() {
		return super.toString() + "BatteryCapacity is: " + batteryCapacity + " kWh" + "\nChargingTime is: " + chargingTime + " hours ";
	}

}
