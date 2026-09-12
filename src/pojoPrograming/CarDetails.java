package pojoPrograming;

public class CarDetails {
	
		private String carID;
		private String brand;
		private String model;
		private double price;
		private String color;
		private int manufacturingYear;
		private String fuelType;
		private String transmission;
		private double mileage;
		private double engineCapacity;
		private int seatingCapacity;
		private String registrationNumber;
		private String ownerName;
		private String insuranceStatus;
		private String carStatus;

		public CarDetails() {

		}


		public CarDetails(String carID, String brand, String model, double price, String color, int manufacturingYear, String fuelType, String transmission, double mileage, double engineCapacity, int seatingCapacity, String registrationNumber, String ownerName, String insuranceStatus, String carStatus) {

			this.carID = carID;
			this.brand = brand;
			this.model = model;
			this.price = price;
			this.color = color;
			this.manufacturingYear = manufacturingYear;
			this.fuelType = fuelType;
			this.transmission = transmission;
			this.mileage = mileage;
			this.engineCapacity = engineCapacity;
			this.seatingCapacity = seatingCapacity;
			this.registrationNumber = registrationNumber;
			this.ownerName = ownerName;
			this.insuranceStatus = insuranceStatus;
			this.carStatus = carStatus;
		}


		public String getCarID() {

			return carID;
		}


		public void setCarID(String carID) {

			this.carID = carID;
		}


		public String getBrand() {

			return brand;
		}


		public void setBrand(String brand) {

			this.brand = brand;
		}


		public String getModel() {

			return model;
		}


		public void setModel(String model) {

			this.model = model;
		}


		public double getPrice() {

			return price;
		}


		public void setPrice(double price) {

			this.price = price;
		}


		public String getColor() {

			return color;
		}


		public void setColor(String color) {

			this.color = color;
		}


		public int getManufacturingYear() {

			return manufacturingYear;
		}


		public void setManufacturingYear(int manufacturingYear) {

			this.manufacturingYear = manufacturingYear;
		}


		public String getFuelType() {

			return fuelType;
		}


		public void setFuelType(String fuelType) {

			this.fuelType = fuelType;
		}


		public String getTransmission() {

			return transmission;
		}


		public void setTransmission(String transmission) {

			this.transmission = transmission;
		}


		public double getMileage() {

			return mileage;
		}


		public void setMileage(double mileage) {

			this.mileage = mileage;
		}


		public double getEngineCapacity() {

			return engineCapacity;
		}


		public void setEngineCapacity(double engineCapacity) {

			this.engineCapacity = engineCapacity;
		}


		public int getSeatingCapacity() {

			return seatingCapacity;
		}


		public void setSeatingCapacity(int seatingCapacity) {

			this.seatingCapacity = seatingCapacity;
		}


		public String getRegistrationNumber() {

			return registrationNumber;
		}


		public void setRegistrationNumber(String registrationNumber) {

			this.registrationNumber = registrationNumber;
		}


		public String getOwnerName() {

			return ownerName;
		}


		public void setOwnerName(String ownerName) {

			this.ownerName = ownerName;
		}


		public String getInsuranceStatus() {

			return insuranceStatus;
		}


		public void setInsuranceStatus(String insuranceStatus) {

			this.insuranceStatus = insuranceStatus;
		}


		public String getCarStatus() {

			return carStatus;
		}


		public void setCarStatus(String carStatus) {

			this.carStatus = carStatus;
		}

	

}
