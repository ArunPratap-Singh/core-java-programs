package immutableClassProgram;

public final class MobilePhone {

	private final int mobileId;
	private final String brand;
	private final String model;
	private final String operatingSystem;
	private final double price;
	private final int ram;
	private final int storage;

	MobilePhone(int mobileId, String brand, String model, String operatingSystem, double price, int ram, int storage) {

		this.mobileId = mobileId;
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
	}

	public int getMobileId() {
		return mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public double getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public int getStorage() {
		return storage;
	}

}
