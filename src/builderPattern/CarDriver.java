package builderPattern;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c1 = new Car.Builder().setBrand("Tata").setModel("Nexon").setPrice(1200000.0).setColor("Black").setManufacturingYear(2024).setFuelType("Petrol").build();

		Car c2 = new Car.Builder().setBrand("Mahindra").setModel("Thar").setPrice(1500000.0).setColor("Red").setManufacturingYear(2023).setFuelType("Diesel").build();

		Car c3 = new Car.Builder().setBrand("Maruti").setModel("Swift").setPrice(800000.0).setColor("White").setManufacturingYear(2024).setFuelType("Petrol").build();

		Car c4 = new Car.Builder().setBrand("Hyundai").setModel("Creta").setPrice(1400000.0).setColor("Blue").setManufacturingYear(2023).setFuelType("Diesel").build();

		Car c5 = new Car.Builder().setBrand("Toyota").setModel("Fortuner").setPrice(3500000.0).setColor("Black").setManufacturingYear(2024).setFuelType("Diesel").build();

		Car c6 = new Car.Builder().setBrand("Honda").setModel("City").setPrice(1200000.0).setColor("Silver").setManufacturingYear(2022).setFuelType("Petrol").build();

		Car c7 = new Car.Builder().setBrand("Kia").setModel("Seltos").setPrice(1300000.0).setColor("Grey").setManufacturingYear(2024).setFuelType("Petrol").build();

		Car c8 = new Car.Builder().setBrand("BMW").setModel("X5").setPrice(9500000.0).setColor("White").setManufacturingYear(2023).setFuelType("Diesel").build();

		Car c9 = new Car.Builder().setBrand("Audi").setModel("A6").setPrice(6500000.0).setColor("Black").setManufacturingYear(2022).setFuelType("Petrol").build();

		Car c10 = new Car.Builder().setBrand("Mercedes").setModel("C-Class").setPrice(7000000.0).setColor("Silver").setManufacturingYear(2024).setFuelType("Petrol").build();

		Car c11 = new Car.Builder().setBrand("Volkswagen").setModel("Virtus").setPrice(1100000.0).setColor("Red").setManufacturingYear(2023).setFuelType("Petrol").build();

		Car c12 = new Car.Builder().setBrand("Skoda").setModel("Slavia").setPrice(1200000.0).setColor("Blue").setManufacturingYear(2024).setFuelType("Petrol").build();

		Car c13 = new Car.Builder().setBrand("Renault").setModel("Kiger").setPrice(700000.0).setColor("Orange").setManufacturingYear(2022).setFuelType("Petrol").build();

		Car c14 = new Car.Builder().setBrand("Nissan").setModel("Magnite").setPrice(650000.0).setColor("White").setManufacturingYear(2023).setFuelType("Petrol").build();

		Car c15 = new Car.Builder().setBrand("MG").setModel("Hector").setPrice(1800000.0).setColor("Green").setManufacturingYear(2024).setFuelType("Diesel").build();

		Car c16 = new Car.Builder().setBrand("Jeep").setModel("Compass").setPrice(2200000.0).setColor("Black").setManufacturingYear(2023).setFuelType("Diesel").build();

		Car c17 = new Car.Builder().setBrand("Tata").setModel("Punch").setPrice(800000.0).setColor("Yellow").setManufacturingYear(2024).setFuelType("Petrol").build();

		Car c18 = new Car.Builder().setBrand("Mahindra").setModel("Scorpio").setPrice(1600000.0).setColor("White").setManufacturingYear(2022).setFuelType("Diesel").build();

		Car c19 = new Car.Builder().setBrand("Maruti").setModel("Brezza").setPrice(950000.0).setColor("Blue").setManufacturingYear(2023).setFuelType("Petrol").build();

		Car c20 = new Car.Builder().setBrand("Hyundai").setModel("Venue").setPrice(900000.0).setColor("Grey").setManufacturingYear(2024).setFuelType("Diesel").build();
		
		System.out.println(c1);
		System.out.println("====================");

		System.out.println(c2);
		System.out.println("====================");

		System.out.println(c3);
		System.out.println("====================");

		System.out.println(c4);
		System.out.println("====================");

		System.out.println(c5);
		System.out.println("====================");

		System.out.println(c6);
		System.out.println("====================");

		System.out.println(c7);
		System.out.println("====================");

		System.out.println(c8);
		System.out.println("====================");

		System.out.println(c9);
		System.out.println("====================");

		System.out.println(c10);
		System.out.println("====================");

		System.out.println(c11);
		System.out.println("====================");

		System.out.println(c12);
		System.out.println("====================");

		System.out.println(c13);
		System.out.println("====================");

		System.out.println(c14);
		System.out.println("====================");

		System.out.println(c15);
		System.out.println("====================");

		System.out.println(c16);
		System.out.println("====================");

		System.out.println(c17);
		System.out.println("====================");

		System.out.println(c18);
		System.out.println("====================");

		System.out.println(c19);
		System.out.println("====================");

		System.out.println(c20);
	}

}
