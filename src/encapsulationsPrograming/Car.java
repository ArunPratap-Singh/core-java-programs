package encapsulationsPrograming;

public class Car {
	
		private String brand;
		private String model;
		private String color;
		private int year;
		private double speed;
		
		Car() {
			
		}	

		Car(String brand, String model, String color, int year, double speed) {

			this.brand = brand;
			this.model = model;
			this.color = color;
			this.year = year;
			this.speed = speed;
		}

		public void setBrand(String brand) {
			if(brand.length() > 2 && brand.length() <= 30 && !brand.isBlank() && brand.matches("[A-Z a-z \s]+"))
				this.brand = brand;
			else
				System.out.println("Wrong brand entered");
		}

		public String getBrand() {
			return brand;
		}

		public void setModel(String model) {
			if(model.length() > 1 && model.length() <= 30 && !model.isBlank() && model.matches("[A-Z a-z 0-9]+"))
				this.model = model;
			else
				System.out.println("Wrong model entered");
		}

		public String getModel() {
			return model;
		}

		public void setColor(String color) {
			if(color.length() > 2 && color.length() <= 20 && !color.isBlank() && color.matches("[A-Z a-z]+"))
				this.color = color;
			else
				System.out.println("Wrong color entered");
		}

		public String getColor() {
			return color;
		}

		public void setYear(int year) {
			if(year >= 1900 && year <= 2026)
				this.year = year;
			else
				System.out.println("Wrong year entered");
		}

		public int getYear() {
			return year;
		}

		public void setSpeed(double speed) {
			if(speed >= 0 && speed <= 400)
				this.speed = speed;
			else
				System.out.println("Wrong speed entered");
		}

		public double getSpeed() {
			return speed;
		}
	

}
