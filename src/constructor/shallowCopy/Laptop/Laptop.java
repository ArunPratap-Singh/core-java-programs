package constructor.shallowCopy.Laptop;

public class Laptop {
	
		String name;
		String brand;
		int price;
		String color;
		Processor p;

		Laptop() {

		}

		Laptop(String name, String brand, int price, String color, Processor p) {

			this.name = name;
			this.brand = brand;
			this.price = price;
			this.color = color;
			this.p = p;

		}

		Laptop(Laptop l) {

			this.name = l.name;
			this.brand = l.brand;
			this.price = l.price;
			this.color = l.color;
			this.p = l.p;

		}

		public String toString() {

			return "Name is: " + name + "\nBrand is: " + brand + "\nPrice is: " + price + "\nColor is: " + color + "\nP is: " + p + "\n========================";

		}

	

}
