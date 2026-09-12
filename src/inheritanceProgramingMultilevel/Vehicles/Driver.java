package inheritanceProgramingMultilevel.Vehicles;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("=============================Main Method Starts================================");

		LuxuryAutonomousCar l1 = new LuxuryAutonomousCar("Mercedes-Benz", "EQE SUV", 2026, "Electric", 0, 5, "Automatic", 90, 1, "MBUX", true, 4, "LiDAR + Radar + Camera", "Premium Leather", 12500000.50);
		LuxuryAutonomousCar l2 = new LuxuryAutonomousCar("BMW", "iX", 2026, "Electric", 0, 5, "Automatic", 105, 1, "BMW iDrive", true, 4, "LiDAR + Radar + Camera", "Vernasca Leather", 14500000.75);
		LuxuryAutonomousCar l3 = new LuxuryAutonomousCar("Audi", "Q8 e-tron", 2026, "Electric", 0, 5, "Automatic", 114, 1, "MMI", true, 3, "Radar + Camera", "Valcona Leather", 11800000.00);
		LuxuryAutonomousCar l4 = new LuxuryAutonomousCar("Tesla", "Model X", 2026, "Electric", 0, 5, "Automatic", 100, 1, "Tesla OS", true, 4, "Camera + Radar", "Premium Vegan Leather", 13500000.25);
		LuxuryAutonomousCar l5 = new LuxuryAutonomousCar("Porsche", "Taycan Turbo", 2026, "Electric", 0, 4, "Automatic", 93, 1, "Porsche PCM", true, 3, "Radar + Camera", "Club Leather", 19500000.50);
		LuxuryAutonomousCar l6 = new LuxuryAutonomousCar("Jaguar", "I-PACE", 2026, "Electric", 0, 5, "Automatic", 90, 1, "Pivi Pro", true, 3, "LiDAR + Camera", "Windsor Leather", 11000000.00);
		LuxuryAutonomousCar l7 = new LuxuryAutonomousCar("Volvo", "EX90", 2026, "Electric", 0, 7, "Automatic", 111, 1, "Google Automotive OS", true, 4, "LiDAR + Radar + Camera", "Nappa Leather", 12500000.75);
		LuxuryAutonomousCar l8 = new LuxuryAutonomousCar("Lexus", "RZ 450e", 2026, "Electric", 0, 5, "Automatic", 71, 1, "Lexus Interface", true, 3, "Radar + Camera", "Semi-Aniline Leather", 9500000.50);
		LuxuryAutonomousCar l9 = new LuxuryAutonomousCar("Genesis", "GV60", 2026, "Electric", 0, 5, "Automatic", 77, 1, "Genesis Connected", true, 3, "Camera + Radar", "Nappa Leather", 9200000.00);
		LuxuryAutonomousCar l10 = new LuxuryAutonomousCar("Range Rover", "Range Rover EV", 2026, "Electric", 0, 5, "Automatic", 100, 1, "Pivi Pro", true, 4, "LiDAR + Radar + Camera", "Semi-Aniline Leather", 18000000.25);
		LuxuryAutonomousCar l11 = new LuxuryAutonomousCar("Lucid", "Air Grand Touring", 2026, "Electric", 0, 5, "Automatic", 112, 1, "Lucid UX", true, 3, "LiDAR + Radar", "Nappa Leather", 15500000.50);
		LuxuryAutonomousCar l12 = new LuxuryAutonomousCar("BYD", "Seal", 2026, "Electric", 0, 5, "Automatic", 82, 1, "DiLink", true, 3, "Radar + Camera", "Premium Leather", 7500000.00);
		LuxuryAutonomousCar l13 = new LuxuryAutonomousCar("Kia", "EV9", 2026, "Electric", 0, 7, "Automatic", 99, 1, "ccNC", true, 3, "LiDAR + Radar + Camera", "Premium Nappa Leather", 8500000.75);
		LuxuryAutonomousCar l14 = new LuxuryAutonomousCar("Hyundai", "IONIQ 9", 2026, "Electric", 0, 7, "Automatic", 110, 1, "ccNC", true, 3, "Radar + Camera", "Premium Leather", 9000000.50);
		LuxuryAutonomousCar l15 = new LuxuryAutonomousCar("Mercedes-Benz", "EQS SUV", 2026, "Electric", 0, 7, "Automatic", 118, 1, "MBUX Hyperscreen", true, 4, "LiDAR + Radar + Camera", "Nappa Leather", 17500000.00);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		System.out.println(l6);
		System.out.println(l7);
		System.out.println(l8);
		System.out.println(l9);
		System.out.println(l10);
		System.out.println(l11);
		System.out.println(l12);
		System.out.println(l13);
		System.out.println(l14);
		System.out.println(l15);
		
		System.out.println("===================================Main Method Ends======================================");
	}

}
