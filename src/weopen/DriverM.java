package weopen;

public class DriverM {

	public static void main(String[] args) {
		 
		Missile m1 = new Missile();
		Missile m2 = new Missile("Astra Mk1", 50000, 50.12, "110Km", "In Service", "Air to Air", "High EXplosive", "Mach 4.5");
		Missile m3 = new Missile("Astra Mk2", 40000, 40.12, "160Km", "In Trail", "Air to Air", "High EXplosive", "Mach 4.5");
		Missile m4 = new Missile("Astra Mk3", 60000, 55.12, "350Km", "In Trial", "Air to Air", "High EXplosive", "Mach 4.5");
		Missile m5 = new Missile("Rudram 1", 70000, 60.12, "150Km", "In Service", "Anti Radiation", "Conventional", "Mach 4.6");
		Missile m6 = new Missile("Rudram 2", 75000, 65.12, "300Km", "Under Development", "Air to Surface", "Conventional", "Mach 3.7");
		Missile m7 = new Missile("Rudram 3", 45000, 110.12, "550Km", "Under Development", "Air to Surface", "Conventional", "Mach 4.8");
		Missile m8 = new Missile("Prithvi Defence Vehicle Mark 2", 85000, 96.12, "1200Km", "Being Tested", "Exo-Atmospheric Hit ti Kill Anti Ballistic Missile", "Kinetic Kill Vehicle", "Mach 3.5");
		Missile m9 = new Missile("Naval Anti Ship Missile-MR", 96000, 350.26, "150-250Km", "In Development", "Medium Range Anti Ship Missile", "Conventional or Nuclear", "Mach 6.5");
		Missile m10 = new Missile("Brahmos", 89000, 200.0, "560Km", "In Service", "Anti Ship Cruise Missile", "Conventional or Nuclear", "Mach 1.2");
		Missile m11 = new Missile("Nag Prospina", 150000, 250.25, "4Km", "In Service", "Third Generation anti tank attack ", "Tandem - charge high explosive Anti Tank", "Mach 1.1");
		Missile m12 = new Missile("Amogh-1", 63000, 150.12, "2.8Km", "Developement Trials", "Air to Air", "Second generation anti tank guided missile", "Mach 5.6");
		Missile m13 = new Missile("Air launched Amogha", 73000, 170.12, "3.8Km", "Developement Trials", "Proposed", "Air launched anti tank missile", "Mach 6.6");
		
		System.out.println("=========================================================================================================");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);
		System.out.println(m8);
		System.out.println(m9);
		System.out.println(m10);
		System.out.println(m11);
		System.out.println(m12);
		System.out.println(m13);
		
		
		

	}

}
