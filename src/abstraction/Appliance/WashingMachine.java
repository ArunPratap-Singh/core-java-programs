package abstraction.Appliance;

public class WashingMachine extends Appliance {

	String washingType;
	double capacity;
	int spinSpeed;
	String drumType;
	String washPrograms;
	boolean automatic;
	boolean dryerAvailable;

	WashingMachine() {

	}

	WashingMachine(int applianceId, String applianceName, String brand, String model, double price, String color,
			String powerSource, int powerConsumption, String warranty, String manufacturingDate, String washingType,
			double capacity, int spinSpeed, String drumType, String washPrograms, boolean automatic,
			boolean dryerAvailable) {

		super(applianceId, applianceName, brand, model, price, color, powerSource, powerConsumption, warranty,
				manufacturingDate);

		this.washingType = washingType;
		this.capacity = capacity;
		this.spinSpeed = spinSpeed;
		this.drumType = drumType;
		this.washPrograms = washPrograms;
		this.automatic = automatic;
		this.dryerAvailable = dryerAvailable;
	}

	@Override
	public void turnOn() {
		System.out.println("Washing Machine is turned ON");
		System.out.println("Washing Type : " + washingType);
		System.out.println("Capacity     : " + capacity + " KG");
	}

	@Override
	public void turnOff() {
		System.out.println("Washing Machine is turned OFF");
	}

	public void startWashing() {
		System.out.println("Washing cycle has started");
	}

	@Override
	public String toString() {
		return "WashingMachine{" + "applianceId=" + applianceId + ", applianceName='" + applianceName + '\''
				+ ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", price=" + price + ", washingType='"
				+ washingType + '\'' + ", capacity=" + capacity + ", spinSpeed=" + spinSpeed + ", drumType='" + drumType
				+ '\'' + ", washPrograms='" + washPrograms + '\'' + ", automatic=" + automatic + ", dryerAvailable="
				+ dryerAvailable + '}';
	}
}
