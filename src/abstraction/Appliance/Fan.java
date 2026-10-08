package abstraction.Appliance;

public class Fan extends Appliance {

	int numberOfBlades;
	String fanType;
	String speedLevel;
	int rpm;
	boolean remoteControl;
	boolean timerAvailable;

	Fan() {

	}

	Fan(int applianceId, String applianceName, String brand, String model, double price, String color,
			String powerSource, int powerConsumption, String warranty, String manufacturingDate, int numberOfBlades,
			String fanType, String speedLevel, int rpm, boolean remoteControl, boolean timerAvailable) {

		super(applianceId, applianceName, brand, model, price, color, powerSource, powerConsumption, warranty,
				manufacturingDate);

		this.numberOfBlades = numberOfBlades;
		this.fanType = fanType;
		this.speedLevel = speedLevel;
		this.rpm = rpm;
		this.remoteControl = remoteControl;
		this.timerAvailable = timerAvailable;
	}

	@Override
	public void turnOn() {
		System.out.println("Fan is turned ON");
		System.out.println("Fan Type : " + fanType);
		System.out.println("Speed    : " + speedLevel);
		System.out.println("RPM      : " + rpm);
	}

	@Override
	public void turnOff() {
		System.out.println("Fan is turned OFF");
	}

	public void changeSpeed() {
		System.out.println("Fan speed is being changed");
	}

	
	@Override
	public String toString() {
		return "Fan{" + "applianceId=" + applianceId + ", applianceName='" + applianceName + '\'' + ", brand='" + brand
				+ '\'' + ", model='" + model + '\'' + ", price=" + price + ", numberOfBlades=" + numberOfBlades
				+ ", fanType='" + fanType + '\'' + ", speedLevel='" + speedLevel + '\'' + ", rpm=" + rpm
				+ ", remoteControl=" + remoteControl + ", timerAvailable=" + timerAvailable + '}';
	}
}
