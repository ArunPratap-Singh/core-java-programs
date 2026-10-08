package abstraction.MobilePhone;

public abstract class MobilePhone {

	int phoneId;
	String brand;
	String model;
	String color;
	double price;
	String operatingSystem;
	String processor;
	int ram;
	int storage;
	String networkType;

	MobilePhone() {

	}

	MobilePhone(int phoneId, String brand, String model, String color, double price, String operatingSystem,
			String processor, int ram, int storage, String networkType) {

		this.phoneId = phoneId;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.networkType = networkType;
	}

	public abstract void makeCall();

	public abstract void sendMessage();

	public abstract void takePhoto();

	
	@Override
	public String toString() {

		return "MobilePhone [phoneId=" + phoneId + ", brand=" + brand + ", model=" + model + ", color=" + color
				+ ", price=" + price + ", operatingSystem=" + operatingSystem + ", processor=" + processor + ", ram="
				+ ram + ", storage=" + storage + ", networkType=" + networkType + "]";
	}
}
