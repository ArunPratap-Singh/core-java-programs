package abstraction.Appliance;

public abstract class Appliance {

	int applianceId;
	String applianceName;
	String brand;
	String model;
	double price;
	String color;
	String powerSource;
	int powerConsumption;
	String warranty;
	String manufacturingDate;

	Appliance() {

	}

	Appliance(int applianceId, String applianceName, String brand, String model, double price, String color,
			String powerSource, int powerConsumption, String warranty, String manufacturingDate) {

		this.applianceId = applianceId;
		this.applianceName = applianceName;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.powerSource = powerSource;
		this.powerConsumption = powerConsumption;
		this.warranty = warranty;
		this.manufacturingDate = manufacturingDate;
	}

	public abstract void turnOn();

	public abstract void turnOff();

	public void displayPrice() {
		System.out.println("Appliance Price : " + price);
	}

	@Override
	public String toString() {
		return "Appliance{" + "applianceId=" + applianceId + ", applianceName='" + applianceName + '\'' + ", brand='"
				+ brand + '\'' + ", model='" + model + '\'' + ", price=" + price + ", color='" + color + '\''
				+ ", powerSource='" + powerSource + '\'' + ", powerConsumption=" + powerConsumption + ", warranty='"
				+ warranty + '\'' + ", manufacturingDate='" + manufacturingDate + '\'' + '}';
	}
}
