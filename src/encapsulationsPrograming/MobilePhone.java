package encapsulationsPrograming;

public class MobilePhone {
	
		private String brand;
		private String model;
		private String color;
		private int ram;
		private double price;
		
		MobilePhone(){
			
		}	

		MobilePhone(String brand, String model, String color, int ram, double price) {

			this.brand = brand;
			this.model = model;
			this.color = color;
			this.ram = ram;
			this.price = price;
		}

		public void setBrand(String brand) {

			if(brand.length()>2 && brand.length()<=20 && !brand.isBlank() && brand.matches("[A-Z a-z \s]+"))
				this.brand = brand;
			else
				System.out.println("Wrong Brand Entered");
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

		public void setRam(int ram) {

			if(ram > 0)
				this.ram = ram;
			else
				System.out.println("Wrong RAM entered");
		}

		public int getRam() {
			return ram;
		}

		public void setPrice(double price) {

			if(price > 0)
				this.price = price;
			else
				System.out.println("Wrong Price entered");
		}

		public double getPrice() {
			return price;
		}
	

}
