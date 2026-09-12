package immutableClassProgram;

public final class Car {

	private final int carId;
	private final String brand;
	private final String model;
	private final String fuelType;
	private final double price;
	private final int seatingCapacity;
	private final String transmission;

	Car(int carId, String brand, String model, String fuelType, double price, int seatingCapacity, String transmission) {

		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.fuelType = fuelType;
		this.price = price;
		this.seatingCapacity = seatingCapacity;
		this.transmission = transmission;
	}

	public int getCarId() {
		return carId;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public double getPrice() {
		return price;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public String getTransmission() {
		return transmission;
	}

}
