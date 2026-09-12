package immutableClassProgram;

public final class VehicleRegistration {

	private final int registrationId;
	private final String ownerName;
	private final String vehicleNumber;
	private final String vehicleType;
	private final String vehicleModel;
	private final String registrationDate;
	private final String registrationStatus;

	VehicleRegistration(int registrationId, String ownerName, String vehicleNumber, String vehicleType, String vehicleModel, String registrationDate, String registrationStatus) {

		this.registrationId = registrationId;
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.vehicleModel = vehicleModel;
		this.registrationDate = registrationDate;
		this.registrationStatus = registrationStatus;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public String getRegistrationStatus() {
		return registrationStatus;
	}

}
