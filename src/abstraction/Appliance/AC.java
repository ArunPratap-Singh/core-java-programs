package abstraction.Appliance;

public class AC extends Appliance {

	double tonnage;
	String acType;
	int temperature;
	String coolingTechnology;
	String energyRating;
	boolean inverter;
	boolean remoteControl;

	AC() {

	}

	AC(int applianceId, String applianceName, String brand, String model, double price, String color,
			String powerSource, int powerConsumption, String warranty, String manufacturingDate, double tonnage,
			String acType, int temperature, String coolingTechnology, String energyRating, boolean inverter,
			boolean remoteControl) {

		super(applianceId, applianceName, brand, model, price, color, powerSource, powerConsumption, warranty,
				manufacturingDate);

		this.tonnage = tonnage;
		this.acType = acType;
		this.temperature = temperature;
		this.coolingTechnology = coolingTechnology;
		this.energyRating = energyRating;
		this.inverter = inverter;
		this.remoteControl = remoteControl;
	}

	@Override
	public void turnOn() {
		System.out.println("AC is turned ON");
		System.out.println("Temperature : " + temperature + "°C");
		System.out.println("Cooling     : " + coolingTechnology);
	}

	@Override
	public void turnOff() {
		System.out.println("AC is turned OFF");
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		System.out.println("AC temperature set to " + temperature + "°C");
	}

	
	@Override
	public String toString() {
		return "AC{" + "applianceId=" + applianceId + ", applianceName='" + applianceName + '\'' + ", brand='" + brand
				+ '\'' + ", model='" + model + '\'' + ", price=" + price + ", tonnage=" + tonnage + ", acType='"
				+ acType + '\'' + ", temperature=" + temperature + ", coolingTechnology='" + coolingTechnology + '\''
				+ ", energyRating='" + energyRating + '\'' + ", inverter=" + inverter + ", remoteControl="
				+ remoteControl + '}';
	}
}
