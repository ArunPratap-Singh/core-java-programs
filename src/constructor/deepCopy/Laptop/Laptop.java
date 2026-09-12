package constructor.deepCopy.Laptop;

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

		//deep copy
		Laptop(Laptop l) {

			this.name = l.name;
			this.brand = l.brand;
			this.price = l.price;
			this.color = l.color;
			this.p = new Processor();
			this.p.cores = l.p.cores;
			this.p.generation = l.p.generation;
			this.p.manufacturer = l.p.manufacturer;
			this.p.processorNumber = l.p.processorNumber;
			this.p.processorType = l.p.processorType;
			this.p.speed = l.p.speed;

		}

		public String toString() {

			return "Name is: " + name + "\nBrand is: " + brand + "\nPrice is: " + price + "\nColor is: " + color + "\nP is: " + p + "\n========================";

		}

	

}
