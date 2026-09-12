package vehicle;

public class Driver3 {

	public static void main(String[] args) {
		
		SportsCar c1 = new SportsCar();
		SportsCar c2 = new SportsCar("Ferrari 488 GTB", "Rs 4.40 Crore", 4, "Ferrari", "661HP", 2, "Petrol", "330Km/h", true);
		SportsCar c3 = new SportsCar("Lamborghini Huracan", "Rs 4.00 Crore", 4, "Lamborghini", "631HP", 2, "Petrol", "325Km/h", false);
		SportsCar c4 = new SportsCar("Porsche 911 Turbo S", "Rs 3.35 Crore", 4, "Porsche", "640HP", 2, "Petrol", "330Km/h", true);
		SportsCar c5 = new SportsCar("McLaren 720S", "Rs 4.65 Crore", 4, "McLaren", "710HP", 2, "Petrol", "341Km/h", true);
		SportsCar c6 = new SportsCar("Audi R8 V10", "Rs 2.72 Crore", 4, "Audi", "602HP", 2, "Petrol", "331Km/h", true);
		
		System.out.println("==========================================================================");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		}

}
