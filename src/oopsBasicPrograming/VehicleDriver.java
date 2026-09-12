package oopsBasicPrograming;

public class VehicleDriver {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();

			System.out.println("==========v1 details before initialization========");
			v1.printDetails();
			System.out.println("==========v2 details before initialization========");
			v2.printDetails();
			System.out.println("==========v3 details before initialization========");
			v3.printDetails();

		v1.name = "Thar";	v2.name = "Scorpio";	v3.name = "Honda City";
		v1.price = 950000;	v2.price = 1050000;	v3.price = 3500000;
		v1.color = "Red";	v2.color = "White";	v3.color = "Black";

			System.out.println("=======v1 details after initialization========");
			v1.printDetails();
			System.out.println("=======v2 details after initialization========");
			v2.printDetails();
			System.out.println("=======v3 details after initialization========");
			v3.printDetails();
	}

}
