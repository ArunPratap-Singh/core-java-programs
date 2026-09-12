package polymorphism.METHODOVERRIDINGPROJECT;

public class User {

	public static void main(String[] args) {
		
		Game g = new Game();
		
		Vehicle v = g.selectAndGetVehicle();
		
		System.out.println("=================");
		
		v.drive();

	}

}
