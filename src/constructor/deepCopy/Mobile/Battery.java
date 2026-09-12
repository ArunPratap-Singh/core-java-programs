package constructor.deepCopy.Mobile;

public class Battery {
	
		int batteryNumber;
		String batteryType;
		int capacity;
		String chargingType;
		double voltage;
		String manufacturer;

		Battery() {

		}

		Battery(int batteryNumber, String batteryType, int capacity, String chargingType, double voltage, String manufacturer) {

			this.batteryNumber = batteryNumber;
			this.batteryType = batteryType;
			this.capacity = capacity;
			this.chargingType = chargingType;
			this.voltage = voltage;
			this.manufacturer = manufacturer;

		}

		public String toString() {

			return "BatteryNumber is: " + batteryNumber + "\nBatteryType is: " + batteryType + "\nCapacity is: " + capacity +"\nChargingType is: " + chargingType + "\nVoltage is: " + voltage + "\nManufacturer is: " + manufacturer;

		}

	

}
