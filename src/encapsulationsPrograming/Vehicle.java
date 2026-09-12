package encapsulationsPrograming;

public class Vehicle {
	
		private String brand;
		private String model;
		private String color;
		private int year;
		private double speedLimit;

		Vehicle(String brand, String model, String color, int year, double speedLimit) {

			this.brand = brand;
			this.model = model;
			this.color = color;
			this.year = year;
			this.speedLimit = speedLimit;
		}


		public void setBrand(String brand) {

			if(brand.length() > 2 && brand.length() <= 30 && !brand.isBlank() && brand.matches("[A-Z a-z \s]+"))

				this.brand = brand;

			else

				System.out.println("Wrong Brand entered");
		}


		public String getBrand() {

			return brand;
		}


		public void setModel(String model) {

			if(model.length() > 1 && model.length() <= 30 && !model.isBlank() && model.matches("[A-Z a-z 0-9]+"))

				this.model = model;

			else

				System.out.println("Wrong Model entered");
		}


		public String getModel() {

			return model;
		}


		public void setColor(String color) {

			if(color.length() > 2 && color.length() <= 20 && !color.isBlank() && color.matches("[A-Z a-z]+"))

				this.color = color;

			else

				System.out.println("Wrong Color entered");
		}


		public String getColor() {

			return color;
		}


		public void setYear(int year) {

			if(year >= 1900 && year <= 2026)

				this.year = year;

			else

				System.out.println("Wrong Year entered");
		}


		public int getYear() {

			return year;
		}


		public void setSpeedLimit(double speedLimit) {

			if(speedLimit > 0 && speedLimit <= 500)

				this.speedLimit = speedLimit;

			else

				System.out.println("Wrong Speed Limit entered");
		}


		public double getSpeedLimit() {

			return speedLimit;
		}

	

}
