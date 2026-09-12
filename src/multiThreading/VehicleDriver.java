package multiThreading;

public class VehicleDriver {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Car", 40);
		Vehicle v2 = new Vehicle("Bike", 30);
		Vehicle v3 = new Vehicle("Cycle", 10);
		Vehicle v4 = new Vehicle("Bus", 50);
		Vehicle v5 = new Vehicle("Train", 500);
		
		v1.drive();
		v2.drive();
		v3.drive();
		v4.drive();
		v5.drive();
		
		

	}

}
