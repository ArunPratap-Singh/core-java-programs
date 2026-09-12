package constructor.shallowCopy.Mobile;

public class Mobile {
	
		String name;
		String brand;
		int price;
		String color;
		Battery b;

		Mobile() {

		}

		Mobile(String name, String brand, int price, String color, Battery b) {

			this.name = name;
			this.brand = brand;
			this.price = price;
			this.color = color;
			this.b = b;

		}

		// Shallow Copy Constructor
		Mobile(Mobile m) {

			this.name = m.name;
			this.brand = m.brand;
			this.price = m.price;
			this.color = m.color;
			this.b = m.b;

		}

		public String toString() {

			return "Name is: " + name + "\nBrand is: " + brand + "\nPrice is: " + price + "\nColor is: " + color + "\nB is: " + b + "\n========================";

		}

	

}
