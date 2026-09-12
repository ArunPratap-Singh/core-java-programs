package multiThreading;

public class Vehicle1Driver {

	public static void main(String[] args) {
		
		Vehicle1 v1 = new Vehicle1("Car", 40);
		Vehicle1 v2 = new Vehicle1("Bike", 30);
		Vehicle1 v3 = new Vehicle1("Cycle", 10);
		Vehicle1 v4 = new Vehicle1("Bus", 50);
		Vehicle1 v5 = new Vehicle1("Train", 500);
		
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		v5.start();
		
		
		
		

	}

}
