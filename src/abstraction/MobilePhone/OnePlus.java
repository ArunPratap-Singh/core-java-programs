package abstraction.MobilePhone;

public class OnePlus extends MobilePhone {

	String camera;
	String displayType;
	int batteryCapacity;
	String chargingTechnology;
	boolean alertSlider;

	OnePlus() {

	}

	OnePlus(int phoneId, String brand, String model, String color, double price, String operatingSystem,
			String processor, int ram, int storage, String networkType, String camera, String displayType,
			int batteryCapacity, String chargingTechnology, boolean alertSlider) {

		super(phoneId, brand, model, color, price, operatingSystem, processor, ram, storage, networkType);

		this.camera = camera;
		this.displayType = displayType;
		this.batteryCapacity = batteryCapacity;
		this.chargingTechnology = chargingTechnology;
		this.alertSlider = alertSlider;
	}

	@Override
	public void makeCall() {
		System.out.println("OnePlus is making a call.");
	}

	@Override
	public void sendMessage() {
		System.out.println("OnePlus is sending a message.");
	}

	@Override
	public void takePhoto() {
		System.out.println("OnePlus is taking a photo.");
	}

	@Override
	public String toString() {

		return "OnePlus [phoneId=" + phoneId + ", brand=" + brand + ", model=" + model + ", color=" + color + ", price="
				+ price + ", operatingSystem=" + operatingSystem + ", processor=" + processor + ", ram=" + ram
				+ ", storage=" + storage + ", networkType=" + networkType + ", camera=" + camera + ", displayType="
				+ displayType + ", batteryCapacity=" + batteryCapacity + ", chargingTechnology=" + chargingTechnology
				+ ", alertSlider=" + alertSlider + "]";
	}
}
