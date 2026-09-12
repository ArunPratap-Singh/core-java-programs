package projects.ProjectVehicle;

public class User {

	public static void main(String[] args) throws InterruptedException {
		
		RacingGame rc = new RacingGame();
		
		Vehicle v =	rc.selectAndGetVehicle();
		
		if(v instanceof Car) {
			Car c = (Car) v;
			System.out.println("Name is: " +c.name);               
			System.out.println("Price is: " +c.price);
			System.out.println("NumberOfWheelsis: " +c.numberofwheels);
			System.out.println("Brandname is: " +c.brandname);
			System.out.println("NumberOfDoors is: " +c.numberofdoors);
			System.out.println("Horsepower is: " +c.horsepower);
			System.out.println("Strokes is: " +c.strokes);
		}else if(v instanceof Bike) {
			Bike b = (Bike) v;
			System.out.println("Name is: " +b.name);
			System.out.println("Price is: " +b.price);
			System.out.println("NumberOfWheelsis:" +b.numberofwheels);
			System.out.println("Brandname is: " +b.brandname);
			System.out.println("Speed is: " +b.speed);
			System.out.println("CC is: " +b.cc);
		}else if(v instanceof Bus) {
			Bus u = (Bus) v;
			System.out.println("Name is: " +u.name);
			System.out.println("Price is: " +u.price);
			System.out.println("NumberOfWheels is: " +u.numberofwheels);
			System.out.println("Route is: " +u.route);
			System.out.println("IS AC is: " +u.isAC);
		}

	}

}
