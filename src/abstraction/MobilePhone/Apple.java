package abstraction.MobilePhone;

public class Apple extends MobilePhone {

	String camera;
	String displayType;
	int batteryCapacity;
	String securityFeature;
	boolean faceId;

	Apple() {

	}

	Apple(int phoneId, String brand, String model, String color, double price, String operatingSystem,
			String processor, int ram, int storage, String networkType, String camera, String displayType,
			int batteryCapacity, String securityFeature, boolean faceId) {

		super(phoneId, brand, model, color, price, operatingSystem, processor, ram, storage, networkType);

		this.camera = camera;
		this.displayType = displayType;
		this.batteryCapacity = batteryCapacity;
		this.securityFeature = securityFeature;
		this.faceId = faceId;
	}

	@Override
	public void makeCall() {
		System.out.println("Apple iPhone is making a call.");
	}

	@Override
	public void sendMessage() {
		System.out.println("Apple iPhone is sending a message.");
	}

	@Override
	public void takePhoto() {
		System.out.println("Apple iPhone is taking a photo.");
	}

	@Override
	public String toString() {

		return "Apple [phoneId=" + phoneId + ", brand=" + brand + ", model=" + model + ", color=" + color + ", price="
				+ price + ", operatingSystem=" + operatingSystem + ", processor=" + processor + ", ram=" + ram
				+ ", storage=" + storage + ", networkType=" + networkType + ", camera=" + camera + ", displayType="
				+ displayType + ", batteryCapacity=" + batteryCapacity + ", securityFeature=" + securityFeature
				+ ", faceId=" + faceId + "]";
	}
}
