package inheritancePrograming;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("========================MAIN METHOD STARTS==========================");
		
		SportsCar s1 = new SportsCar("Ferrari 488", 45000000, 4, "Red", "Ferrari", "661 HP", 2, "Petrol", "330 km/h", true);
		SportsCar s2 = new SportsCar("Lamborghini Huracan", 40000000, 4, "Yellow", "Lamborghini", "630 HP", 2, "Petrol", "325 km/h", true);
		SportsCar s3 = new SportsCar("Porsche 911 Turbo", 35000000, 4, "Black", "Porsche", "640 HP", 2, "Petrol", "330 km/h", true);
		SportsCar s4 = new SportsCar("McLaren 720S", 50000000, 4, "Orange", "McLaren", "710 HP", 2, "Petrol", "341 km/h", true);
		SportsCar s5 = new SportsCar("Audi R8", 30000000, 4, "White", "Audi", "602 HP", 2, "Petrol", "330 km/h", false);
		SportsCar s6 = new SportsCar("BMW M8 Competition", 25000000, 4, "Blue", "BMW", "617 HP", 2, "Petrol", "305 km/h", true);
		SportsCar s7 = new SportsCar("Mercedes AMG GT", 28000000, 4, "Silver", "Mercedes-Benz", "577 HP", 2, "Petrol", "310 km/h", true);
		SportsCar s8 = new SportsCar("Nissan GT-R", 22000000, 4, "Grey", "Nissan", "565 HP", 2, "Petrol", "315 km/h", true);
		SportsCar s9 = new SportsCar("Chevrolet Corvette", 18000000, 4, "Red", "Chevrolet", "495 HP", 2, "Petrol", "296 km/h", false);
		SportsCar s10 = new SportsCar("Ford Mustang GT", 12000000, 4, "Black", "Ford", "450 HP", 2, "Petrol", "250 km/h", false);
		SportsCar s11 = new SportsCar("Aston Martin Vantage", 32000000, 4, "Green", "Aston Martin", "656 HP", 2, "Petrol", "325 km/h", true);
		SportsCar s12 = new SportsCar("Bugatti Chiron", 250000000, 4, "Blue", "Bugatti", "1500 HP", 2, "Petrol", "420 km/h", true);
		SportsCar s13 = new SportsCar("Koenigsegg Jesko", 300000000, 4, "White", "Koenigsegg", "1600 HP", 2, "Petrol", "480 km/h", true);
		SportsCar s14 = new SportsCar("Pagani Huayra", 280000000, 4, "Purple", "Pagani", "720 HP", 2, "Petrol", "383 km/h", true);
		SportsCar s15 = new SportsCar("Maserati MC20", 45000000, 4, "Grey", "Maserati", "630 HP", 2, "Petrol", "325 km/h", true);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
		System.out.println(s15);
		
		System.out.println("===============================MAIN METHOD ENDS==================================");
	}

}
