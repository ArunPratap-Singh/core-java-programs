package inheritanceProgramingMultilevel.Product;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("===================================Main Method Starts======================================");

		PremiumLaptop p1 = new PremiumLaptop(101, "ROG Strix Scar", "ASUS", 250000.50, "Intel Core i9", 32, 16.0, 1024, "NVIDIA RTX 4090", 240, "Advanced Liquid Cooling", "RGB Mechanical Keyboard", "Aluminium", 3.0);
		PremiumLaptop p2 = new PremiumLaptop(102, "Alienware m18", "Dell", 280000.75, "Intel Core i9", 64, 18.0, 2048, "NVIDIA RTX 4090", 165, "Cryo-Tech Cooling", "RGB Mechanical Keyboard", "Magnesium Alloy", 3.0);
		PremiumLaptop p3 = new PremiumLaptop(103, "Legion Pro 7", "Lenovo", 220000.00, "Intel Core i9", 32, 16.0, 1024, "NVIDIA RTX 4080", 240, "ColdFront Cooling", "RGB Keyboard", "Aluminium", 2.0);
		PremiumLaptop p4 = new PremiumLaptop(104, "Predator Helios 18", "Acer", 210000.50, "Intel Core i9", 32, 18.0, 1024, "NVIDIA RTX 4080", 165, "AeroBlade Cooling", "RGB Mechanical Keyboard", "Aluminium", 2.0);
		PremiumLaptop p5 = new PremiumLaptop(105, "MSI Titan GT77", "MSI", 350000.25, "Intel Core i9", 64, 17.3, 2048, "NVIDIA RTX 4090", 144, "Vapor Chamber Cooling", "Cherry Mechanical Keyboard", "Aluminium", 3.0);
		PremiumLaptop p6 = new PremiumLaptop(106, "Razer Blade 18", "Razer", 300000.00, "Intel Core i9", 32, 18.0, 1024, "NVIDIA RTX 4090", 240, "Vapor Chamber Cooling", "Per-Key RGB Keyboard", "CNC Aluminium", 2.0);
		PremiumLaptop p7 = new PremiumLaptop(107, "ROG Zephyrus Duo", "ASUS", 240000.75, "AMD Ryzen 9", 32, 16.0, 1024, "NVIDIA RTX 4080", 240, "Dual Fan Cooling", "RGB Keyboard", "Magnesium Alloy", 2.0);
		PremiumLaptop p8 = new PremiumLaptop(108, "OMEN 17", "HP", 180000.50, "Intel Core i7", 32, 17.3, 1024, "NVIDIA RTX 4070", 165, "OMEN Tempest Cooling", "RGB Keyboard", "Aluminium", 2.0);
		PremiumLaptop p9 = new PremiumLaptop(109, "Legion 9i", "Lenovo", 320000.00, "Intel Core i9", 64, 16.0, 2048, "NVIDIA RTX 4090", 165, "Liquid Cooling System", "RGB Keyboard", "Carbon Fiber", 3.0);
		PremiumLaptop p10 = new PremiumLaptop(110, "AORUS 17X", "Gigabyte", 230000.25, "Intel Core i9", 32, 1024.0 / 64, 1024, "NVIDIA RTX 4080", 240, "WINDFORCE Cooling", "RGB Keyboard", "Aluminium", 2.0);
		PremiumLaptop p11 = new PremiumLaptop(111, "ROG Flow X16", "ASUS", 190000.50, "AMD Ryzen 9", 32, 16.0, 1024, "NVIDIA RTX 4070", 165, "Intelligent Cooling", "Backlit Keyboard", "Aluminium", 2.0);
		PremiumLaptop p12 = new PremiumLaptop(112, "Alienware x16", "Dell", 260000.00, "Intel Core i9", 32, 16.0, 2048, "NVIDIA RTX 4080", 240, "Element 31 Cooling", "RGB Keyboard", "Magnesium Alloy", 3.0);
		PremiumLaptop p13 = new PremiumLaptop(113, "Katana 17", "MSI", 150000.75, "Intel Core i7", 16, 17.3, 1024, "NVIDIA RTX 4070", 144, "Cooler Boost Cooling", "RGB Keyboard", "Plastic and Aluminium", 2.0);
		PremiumLaptop p14 = new PremiumLaptop(114, "Predator Triton 17", "Acer", 275000.50, "Intel Core i9", 32, 17.0, 2048, "NVIDIA RTX 4080", 240, "Advanced AeroBlade Cooling", "RGB Mechanical Keyboard", "Aluminium", 3.0);
		PremiumLaptop p15 = new PremiumLaptop(115, "Razer Blade 16", "Razer", 290000.25, "Intel Core i9", 64, 16.0, 2048, "NVIDIA RTX 4090", 240, "Vapor Chamber Cooling", "Per-Key RGB Keyboard", "CNC Aluminium", 3.0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);
		System.out.println(p8);
		System.out.println(p9);
		System.out.println(p10);
		System.out.println(p11);
		System.out.println(p12);
		System.out.println(p13);
		System.out.println(p14);
		System.out.println(p15);
		
		System.out.println("===================================Main Method Ends========================================");

	}

}
