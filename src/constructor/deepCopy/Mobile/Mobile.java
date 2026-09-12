package constructor.deepCopy.Mobile;

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

		// deep Copy Constructor
		Mobile(Mobile m) {

			this.name = m.name;
			this.brand = m.brand;
			this.price = m.price;
			this.color = m.color;
			this.b = new Battery();
			this.b.batteryNumber = m.b.batteryNumber;
			this.b.batteryType = m.b.batteryType;
			this.b.capacity = m.b.capacity;
			this.b.chargingType = m.b.chargingType;
			this.b.manufacturer = m.b.manufacturer;
			this.b.voltage = m.b.voltage;

		}

		public String toString() {

			return "Name is: " + name + "\nBrand is: " + brand + "\nPrice is: " + price + "\nColor is: " + color + "\nB is: " + b + "\n========================";

		}

	

}
